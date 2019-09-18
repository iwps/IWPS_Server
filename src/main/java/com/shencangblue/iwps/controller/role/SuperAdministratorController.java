package com.shencangblue.iwps.controller.role;

import com.shencangblue.iwps.dto.ResponseObject;
import com.shencangblue.iwps.dto.SuperAdministratorDto;
import com.shencangblue.iwps.entity.SuperAdministrator;
import com.shencangblue.iwps.service.SuperAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

@Controller
@RequestMapping("/superAdmin")
public class SuperAdministratorController {


    private final SuperAdministratorService superAdministratorService;

    @Autowired
    public SuperAdministratorController(SuperAdministratorService superAdministratorService) {
        this.superAdministratorService = superAdministratorService;
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseObject login(@RequestBody SuperAdministratorDto dto){
        System.out.println("loginSuperAdministrator");
        System.out.println(dto.getSuperAdministratorAccount()+":"+dto.getPassword());
        SuperAdministrator superAdministrator =
                superAdministratorService.selectByAccount(dto.getSuperAdministratorAccount());
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(superAdministrator != null&& Objects.equals(superAdministrator.getPassword(), dto.getPassword())){
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
