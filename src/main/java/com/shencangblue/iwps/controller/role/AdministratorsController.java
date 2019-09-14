package com.shencangblue.iwps.controller.role;

import com.shencangblue.iwps.entity.Administrators;
import com.shencangblue.iwps.service.AdministratorsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/administrators")
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


    @RequestMapping(value = "/detail/{administratorId}", method = RequestMethod.GET)
    private String detail(@PathVariable("administratorId") Long administratorId, Model model) {
        Administrators administrator = administratorsService.getById(administratorId);
        model.addAttribute("administrators", administrator);
        return "detail";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    @ResponseBody
    private String add(Administrators administrators) {
        Administrators hasAdmin = administratorsService.getById(administrators.getAdministratorId());
        int i = -2;
        if (hasAdmin == null) {
            i = administratorsService.addAdministrators(administrators);
        }
        return i > 0 ? "success" : "error";
    }

    @RequestMapping(value = "/del/{administratorId}", method = RequestMethod.GET)
    @ResponseBody
    private String deleteAdministratorsById(@PathVariable("administratorId") Long id) {
        int i = administratorsService.deleteAdministratorsById(id);
        return i > 0 ? "success" : "error";
    }
}
