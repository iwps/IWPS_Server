package com.shencangblue.iwps.controller.hardware;

import com.shencangblue.iwps.dto.NatatoriumHistoryDto;
import com.shencangblue.iwps.dto.ResponseObject;
import com.shencangblue.iwps.entity.NatatoriumHistory;
import com.shencangblue.iwps.entity.UserHistory;
import com.shencangblue.iwps.service.NatatoriumHistoryService;
import com.shencangblue.iwps.service.UserHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/History")
public class HistoryController {

    private final UserHistoryService historyService;
    private final NatatoriumHistoryService natatoriumHistoryService;

    @Autowired
    public HistoryController(UserHistoryService historyService, NatatoriumHistoryService natatoriumHistoryService) {
        this.historyService = historyService;
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
}
