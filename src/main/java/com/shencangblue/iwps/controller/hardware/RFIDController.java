package com.shencangblue.iwps.controller.hardware;

import com.shencangblue.iwps.dto.AdministratorsDto;
import com.shencangblue.iwps.dto.ResponseObject;
import com.shencangblue.iwps.dto.UserDto;
import com.shencangblue.iwps.dto.UserHistoryDto;
import com.shencangblue.iwps.entity.RFIDPackage;
import com.shencangblue.iwps.entity.User;
import com.shencangblue.iwps.entity.UserHistory;
import com.shencangblue.iwps.service.UserHistoryService;
import com.shencangblue.iwps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/rfid")
public class RFIDController {

    private final
    UserService userService;
    private final
    UserHistoryService userHistoryService;

    @Autowired
    public RFIDController(UserService userService ,UserHistoryService userHistoryService) {
        this.userService = userService;
        this.userHistoryService= userHistoryService;
    }


    @ResponseBody
    @RequestMapping(value = "/sendList", method = RequestMethod.POST)
    private ResponseObject<String> sendList(@RequestBody RFIDPackage rfidPackage) {
        System.out.println("sendList");
        String RFIDInfo = rfidPackage.getCardId();
        System.out.println(RFIDInfo);
        ResponseObject<String> responseObject = new ResponseObject<String>();
        if(validateUserByRFID(RFIDInfo.trim())){
            System.out.println("已经存在");
            addUserHistory(RFIDInfo.trim());
            responseObject.setMsg("插入历史");
        }else {
            System.out.println("还不存在");
            addUserByFRID(RFIDInfo.trim());
            responseObject.setMsg("插入实体");
        }
        return responseObject;
    }
    //验证RFID是否存在
    private boolean validateUserByRFID(String RFIDInfo){
        UserDto userDto = new UserDto();
        userDto.setRFIDInfo(RFIDInfo);
        User user = userService.selectByRFID(RFIDInfo);
       // return userService.validate(userDto);
        return user != null;
    }

    //添加到用户个体表中
    private void addUserByFRID(String RFIDInfo){
        UserDto userDto = new UserDto();
        userDto.setUserAccount("user"+RFIDInfo);
        userDto.setName("新用户-未改名");
        userDto.setPassword("123456");
        userDto.setAvatar("null");
        userDto.setSwimmingGrade("未定义");
        userDto.setRFIDInfo(RFIDInfo);
        userService.addUser(userDto);
    }

    private void addUserHistory(String RFIDInfo){
        UserDto userDto = new UserDto();
        userDto.setRFIDInfo(RFIDInfo);
        userDto.setPage(1);
        userDto.setLimit(100);
        List<UserDto> userList = userService.getList(userDto);
        System.out.println(userList.get(0).getUserId());
        System.out.println(RFIDInfo);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        UserHistoryDto userHistoryDto = new UserHistoryDto();
        userHistoryDto.setRFIDInfo(RFIDInfo);
        userHistoryDto.setUserId(userList.get(0).getUserId());
        userHistoryDto.setSensorId("1");
        userHistoryDto.setWaterPressure("0");
        userHistoryDto.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        System.out.println(userHistoryDto.getTime());
        userHistoryService.add(userHistoryDto);

    }


    /**
     * 查询所有用户记录
     */
    @ResponseBody
    @RequestMapping(value = "listUserHis",method = RequestMethod.GET)
    private ResponseObject listUserHis(@RequestParam(value = "page",defaultValue = "1",required = true)
                                             int page ,@RequestParam(value = "limit",defaultValue = "10",required = true)
                                             int limit){
        System.out.println("listUserHis");
        UserHistoryDto dto=new UserHistoryDto();
        dto.setLimit(limit);
        dto.setPage(page);
        ResponseObject<List<UserHistoryDto>> responseObject=new ResponseObject<>();
        responseObject.setCode(0);
        responseObject.setMsg("listUserHis");
        responseObject.setData(userHistoryService.getList(dto));
        responseObject.setCount(userHistoryService.selectCount());
        return responseObject;

    }
}
