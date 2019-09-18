package com.shencangblue.iwps.controller.role;

import com.shencangblue.iwps.dto.AdministratorsDto;
import com.shencangblue.iwps.dto.ResponseObject;
import com.shencangblue.iwps.entity.Administrators;
import com.shencangblue.iwps.service.AdministratorsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/admin")
public class AdministratorsController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final AdministratorsService administratorsService;

    @Autowired
    public AdministratorsController(AdministratorsService administratorsService) {
        this.administratorsService = administratorsService;
    }

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


    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseObject login(@RequestBody AdministratorsDto dto){
        System.out.println("loginAdministrator");
        System.out.println(dto.getAdministratorAccount()+":"+dto.getPassword());
        Administrators administrator =
                administratorsService.selectByAccount(dto.getAdministratorAccount());
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(administrator != null&& Objects.equals(administrator.getPassword(), dto.getPassword())){
            System.out.println("登录成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(1);
            responseObject.setCode(0);
        }else {
            responseObject.setMsg("NO");
            responseObject.setCount(1);
            responseObject.setCode(-1);

        }
        return responseObject;
    }
}
