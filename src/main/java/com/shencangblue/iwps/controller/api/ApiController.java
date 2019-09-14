package com.shencangblue.iwps.controller.api;

import com.shencangblue.iwps.dto.ResponseObject;
import com.shencangblue.iwps.dto.UserDto;
import com.shencangblue.iwps.entity.SuperAdministrator;
import com.shencangblue.iwps.entity.User;
import com.shencangblue.iwps.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api")
public class ApiController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //角色
    @Autowired
    private AdministratorsService administratorsService;
    @Autowired
    private SuperAdministratorService superAdministratorService;
    @Autowired
    private UserService userService;
    @Autowired
    private LifeguardService lifeguardService;
    //设施
    @Autowired
    private SwimmingPoolService swimmingPoolService;
    @Autowired
    private NatatoriumService natatoriumService;


    @ResponseBody
    @RequestMapping(value = "listAdmin",method = RequestMethod.GET)
    private ResponseObject listAdmin(@RequestParam(value = "page",defaultValue = "1",required = true)
                                     int page ,@RequestParam(value = "limit",defaultValue = "10",required = true)
                                     int limit){
        System.out.println("listUsers");
        UserDto dto=new UserDto();
        dto.setLimit(limit);
        dto.setPage(page);
        ResponseObject<List<UserDto>> responseObject=new ResponseObject<>();
        responseObject.setCode(0);
        responseObject.setMsg("");
        responseObject.setData(userService.getList(dto));
        responseObject.setCount(userService.selectCount());
        return responseObject;

    }



}
