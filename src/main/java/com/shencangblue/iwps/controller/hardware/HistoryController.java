package com.shencangblue.iwps.controller.hardware;

import com.shencangblue.iwps.dto.NatatoriumHistoryDto;
import com.shencangblue.iwps.dto.ResponseObject;
import com.shencangblue.iwps.dto.UserHistoryDto;
import com.shencangblue.iwps.entity.NatatoriumHistory;
import com.shencangblue.iwps.entity.UserHistory;
import com.shencangblue.iwps.service.NatatoriumHistoryService;
import com.shencangblue.iwps.service.UserHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/history")
public class HistoryController {

    private final UserHistoryService userHistoryService;
    private final NatatoriumHistoryService natatoriumHistoryService;

    @Autowired
    public HistoryController(UserHistoryService userHistoryService, NatatoriumHistoryService natatoriumHistoryService) {
        this.userHistoryService = userHistoryService;
        this.natatoriumHistoryService = natatoriumHistoryService;
    }

    /**
     * 查询所有用户记录
     */
    @ResponseBody
    @RequestMapping(value = "listNataHis",method = RequestMethod.GET)
    private ResponseObject listNataHis(@RequestParam(value = "page",defaultValue = "1",required = true)
                                               int page , @RequestParam(value = "limit",defaultValue = "10",required = true)
                                               int limit){
        System.out.println("listNataHis");
        NatatoriumHistoryDto dto=new NatatoriumHistoryDto();
        dto.setLimit(limit);
        dto.setPage(page);
        ResponseObject<List<NatatoriumHistoryDto>> responseObject=new ResponseObject<>();
        responseObject.setCode(0);
        responseObject.setMsg("listNataHis");
        responseObject.setData(natatoriumHistoryService.getList(dto));
        responseObject.setCount(natatoriumHistoryService.selectCount());
        return responseObject;

    }

    /**
     * 添加nata数据
     */
    @ResponseBody
    @RequestMapping(value = "/addNataHis", method = RequestMethod.POST)
    public ResponseObject addNataHis(@RequestBody NatatoriumHistoryDto dto){
        System.out.println("addNataHis");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(natatoriumHistoryService.add(dto)){
            System.out.println("添加成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(1);
            responseObject.setCode(0);
        }
        return responseObject;
    }

    /**
     * 添加user数据
     */
    @ResponseBody
    @RequestMapping(value = "/addUserHis", method = RequestMethod.POST)
    public ResponseObject addUserHis(@RequestBody UserHistoryDto dto){
        System.out.println("addUserHis");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(userHistoryService.add(dto)){
            System.out.println("添加成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(1);
            responseObject.setCode(0);
        };
        return responseObject;
    }
}
