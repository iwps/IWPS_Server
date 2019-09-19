package com.shencangblue.iwps.controller.hardware;

import com.shencangblue.iwps.entity.UserHistory;
import com.shencangblue.iwps.service.NatatoriumHistoryService;
import com.shencangblue.iwps.service.UserHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/History")
public class HistoryController {

    @Autowired
    private UserHistoryService historyService;
    @Autowired
    private NatatoriumHistoryService natatoriumHistoryService;
}
