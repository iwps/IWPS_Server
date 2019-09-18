package com.shencangblue.iwps.controller.role;

import com.shencangblue.iwps.dto.LifeguardDto;
import com.shencangblue.iwps.dto.ResponseObject;
import com.shencangblue.iwps.entity.Lifeguard;
import com.shencangblue.iwps.service.LifeguardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

@Controller
@RequestMapping("/lifeguard")
public class LifeguardController {

    private final LifeguardService lifeguardService;

    @Autowired
    public LifeguardController(LifeguardService lifeguardService) {
        this.lifeguardService = lifeguardService;
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseObject login(@RequestBody LifeguardDto dto){
        System.out.println("loginSuperAdministrator");
        System.out.println(dto.getLifeguardAccount()+":"+dto.getPassword());
        Lifeguard lifeguard =
                lifeguardService.selectByAccount(dto.getLifeguardAccount());
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(lifeguard != null&& Objects.equals(lifeguard.getPassword(), dto.getPassword())){
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
