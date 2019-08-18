package com.shencangblue.iwps.web;

import com.shencangblue.iwps.entity.Administrators;
import com.shencangblue.iwps.service.AdministratorsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/Administrators")
public class AdministratorsController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AdministratorsService administratorsService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    private  String list(Model model){
        List<Administrators>list = administratorsService.getList(0,1000);
        model.addAttribute("list",list);
        return  "list";// WEB-INF/jsp/"list".jsp

    }
}
