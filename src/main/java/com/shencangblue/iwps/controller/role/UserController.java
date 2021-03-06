package com.shencangblue.iwps.controller.role;

import com.shencangblue.iwps.dto.ResponseObject;
import com.shencangblue.iwps.dto.UserDto;
import com.shencangblue.iwps.entity.User;
import com.shencangblue.iwps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseObject login(@RequestBody UserDto dto){
        System.out.println("loginUser");
        System.out.println(dto.getUserAccount()+":"+dto.getPassword());
        User user = userService.selectByAccount(dto.getUserAccount());
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(user != null&& Objects.equals(user.getPassword(), dto.getPassword())){
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
