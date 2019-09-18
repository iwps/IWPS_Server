package com.shencangblue.iwps.controller.hardware;

import com.shencangblue.iwps.dto.ResponseObject;
import com.shencangblue.iwps.entity.RFIDPackage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/rfid")
public class RFIDController {

    @ResponseBody
    @RequestMapping(value = "/sendList", method = RequestMethod.POST)
    private ResponseObject<String> sendList(@RequestBody RFIDPackage rfidPackage) {
        System.out.println("sendList");
        String RFIDInfo = rfidPackage.getCardId();
        System.out.println(RFIDInfo);
        ResponseObject<String> responseObject = new ResponseObject<String>();
        if(validateDonkeyByRFID(RFIDInfo.trim())){
            System.out.println("已经存在");
            addDonkeyHistory(RFIDInfo.trim());
            responseObject.setMsg("插入历史");
        }else {
            System.out.println("还不存在");
            addDonkeyByFRID(RFIDInfo.trim());
            responseObject.setMsg("插入实体");
        }
        return responseObject;
    }
    //验证RFID是否存在
    public boolean validateDonkeyByRFID(String RFIDInfo){
//        DonkeyDto donkeyDto = new DonkeyDto();
//        donkeyDto.setRFIDInfo(RFIDInfo);
//        return donkeyService.validate(donkeyDto);
        return true;
    }

    //添加到驴个体表中
    public boolean addDonkeyByFRID(String RFIDInfo){
//        DonkeyDto donkeyDto = new DonkeyDto();
//        donkeyDto.setHomeId(1L);
//        donkeyDto.setGender("雄");
//        donkeyDto.setSize(15l);
//        donkeyDto.setRFIDInfo(RFIDInfo);
//        return donkeyService.add(donkeyDto);
        return true;
    }

    public boolean addDonkeyHistory(String RFIDInfo){
//        DonkeyDto donkeyDto = new DonkeyDto();
//        donkeyDto.setRFIDInfo(RFIDInfo);
//        donkeyDto.setPage(1);
//        donkeyDto.setLimit(100);
//        List<DonkeyDto> donkeyList = donkeyService.getList(donkeyDto);
//
//        DonkeyHistoryDto donkeyHistoryDto = new DonkeyHistoryDto();
//        donkeyHistoryDto.setRFIDInfo(RFIDInfo);
//        donkeyHistoryDto.setSize(donkeyList.get(0).getSize());
//        donkeyHistoryDto.setDonkeyId(donkeyList.get(0).getDonkeyId());
//        donkeyHistoryDto.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
//        return donkeyHistoryService.add(donkeyHistoryDto);
        return true;
    }
}
