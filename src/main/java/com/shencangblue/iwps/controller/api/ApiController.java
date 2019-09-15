package com.shencangblue.iwps.controller.api;

import com.shencangblue.iwps.dto.*;
import com.shencangblue.iwps.entity.SuperAdministrator;
import com.shencangblue.iwps.entity.User;
import com.shencangblue.iwps.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class ApiController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //角色
    private final AdministratorsService administratorsService;
    private final SuperAdministratorService superAdministratorService;
    private final UserService userService;
    private final LifeguardService lifeguardService;
    //设施
    private final SwimmingPoolService swimmingPoolService;
    private final NatatoriumService natatoriumService;

    @Autowired
    public ApiController(AdministratorsService administratorsService, SuperAdministratorService superAdministratorService, UserService userService, LifeguardService lifeguardService, SwimmingPoolService swimmingPoolService, NatatoriumService natatoriumService) {
        this.administratorsService = administratorsService;
        this.superAdministratorService = superAdministratorService;
        this.userService = userService;
        this.lifeguardService = lifeguardService;
        this.swimmingPoolService = swimmingPoolService;
        this.natatoriumService = natatoriumService;
    }


//    管理员
    /**
     * 查询所有管理员
     */
    @ResponseBody
    @RequestMapping(value = "listAdmin",method = RequestMethod.GET)
    private ResponseObject listAdmin(@RequestParam(value = "page",defaultValue = "1",required = true)
                                     int page ,@RequestParam(value = "limit",defaultValue = "10",required = true)
                                     int limit){
        System.out.println("listAdmin");
        AdministratorsDto dto=new AdministratorsDto();
        dto.setLimit(limit);
        dto.setPage(page);
        ResponseObject<List<AdministratorsDto>> responseObject=new ResponseObject<>();
        responseObject.setCode(100001);
        responseObject.setMsg("Administrators");
        responseObject.setData(administratorsService.getList(dto));
        responseObject.setCount(administratorsService.selectCount());
        return responseObject;

    }
    /**
     * 添加管理员
     */
    @ResponseBody
    @RequestMapping(value = "/addAdmin", method = RequestMethod.POST)
    public ResponseObject addAdmin(@RequestBody AdministratorsDto dto){
        System.out.println("addAdmin");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(administratorsService.addAdministrators(dto)){
            System.out.println("添加成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(1);
            responseObject.setCode(101000);
        };
        return responseObject;
    }

    /**
     * 单次删除管理员
     */
    @ResponseBody
    @RequestMapping(value = "/deleteAdmin/{administratorId}", method = RequestMethod.GET)
    public ResponseObject deleteAdmin(@PathVariable Long administratorId){
        System.out.println("deleteAdmin");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(administratorsService.deleteAdministratorsByIdDto(administratorId)){
            System.out.println("删除成功！");
            responseObject.setMsg("delete_success");
            responseObject.setCount(1);
            responseObject.setCode(100100);
        };
        return responseObject;
    }

    /**
     * 全部删除管理员
     */
    @ResponseBody
    @RequestMapping(value = "/deleteAllAdmin", method = RequestMethod.GET)
//	传入：http://localhost:8080/api/deleteAllUser?data=10,11,12,13,14
    public ResponseObject<String> deleteAllAdmin(@RequestParam(value="data") Long[] data){
        System.out.println("deleteAllAdmin:"+data.length);
        int count=0;
        ResponseObject<String> responseObject=new ResponseObject<>();
        for(Long item:data){
            if(administratorsService.deleteAdministratorsByIdDto(item)){
                count++;
                System.out.println("删除:"+item);
            }
        }
        if(data.length==count){
            System.out.println("删除所有成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(count);
            responseObject.setCode(110100);
        }
        return responseObject;
    }

    /**
     * 修改管理员信息
     */

    @ResponseBody
    @RequestMapping(value = "/editAdmin", method = RequestMethod.POST)
    public ResponseObject editAdmin(@RequestBody AdministratorsDto dto){
        System.out.println("editAdmin");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(administratorsService.updateAdministrators(dto)){
            System.out.println("修改成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(1);
            responseObject.setCode(100010);
        };
        return responseObject;
    }


// 用户
    /**
     * 查询所有用户
     */
//@RequestParam(value="page",defaultValue="1",required=true) int page,@RequestParam(value="limit",defaultValue="10",required=true) int limit
    @ResponseBody
    @RequestMapping(value = "/listUsers", method = RequestMethod.GET)
    private ResponseObject listUsers(@RequestParam(value="page",defaultValue="1",required=true) int page
            ,@RequestParam(value="limit",defaultValue="10",required=true) int limit) {
        System.out.println("listUsers");
        UserDto dto=new UserDto();
        dto.setLimit(limit);
        dto.setPage(page);
        ResponseObject<List<UserDto>> responseObject=new ResponseObject<>();
        responseObject.setCode(100002);
        responseObject.setMsg("User");
        responseObject.setData(userService.getList(dto));
        responseObject.setCount(userService.selectCount());
        return responseObject;
    }
    /**
     * 添加用户
     */
    @ResponseBody
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ResponseObject addUser(@RequestBody UserDto dto){
        System.out.println("addUser");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(userService.addUser(dto)){
            System.out.println("添加成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(1);
            responseObject.setCode(102000);
        };
        return responseObject;
    }
    /**
     * 单次删除用户
     */
    @ResponseBody
    @RequestMapping(value = "/deleteUser/{userId}", method = RequestMethod.GET)
    public ResponseObject deleteUser(@PathVariable Long userId){
        System.out.println("deleteUser");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(userService.deleteUserByIdDto(userId)){
            System.out.println("删除成功！");
            responseObject.setMsg("delete_success");
            responseObject.setCount(1);
            responseObject.setCode(100200);
        };
        return responseObject;
    }

    /**
     * 全部删除用户
     */
    @ResponseBody
    @RequestMapping(value = "/deleteAllUser", method = RequestMethod.GET)
//	传入：http://localhost:8080/api/deleteAllUser?data=10,11,12,13,14
    public ResponseObject<String> deleteAllUser(@RequestParam(value="data") Long[] data){
        System.out.println("deleteAllUser:"+data.length);
        int count=0;
        ResponseObject<String> responseObject=new ResponseObject<>();
        for(Long item:data){
            if(userService.deleteUserByIdDto(item)){
                count++;
                System.out.println("删除:"+item);
            };
        }
        if(data.length==count){
            System.out.println("删除所有成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(count);
            responseObject.setCode(110200);
        }
        return responseObject;
    }

    /**
     * 修改用户信息
     */
    @ResponseBody
    @RequestMapping(value = "/editUser", method = RequestMethod.POST)
    public ResponseObject editUser(@RequestBody UserDto dto){
        System.out.println("editUser");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(userService.updateUser(dto)){
            System.out.println("修改成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(1);
            responseObject.setCode(100020);
        };
        return responseObject;
    }



//    超级管理员
    /**
     * 查询所有管理员
     */
    @ResponseBody
    @RequestMapping(value = "listSuperAdmin",method = RequestMethod.GET)
    private ResponseObject listSuperAdmin(@RequestParam(value = "page",defaultValue = "1",required = true)
                                             int page ,@RequestParam(value = "limit",defaultValue = "10",required = true)
                                             int limit){
        System.out.println("listSuperAdmin");
        SuperAdministratorDto dto=new SuperAdministratorDto();
        dto.setLimit(limit);
        dto.setPage(page);
        ResponseObject<List<SuperAdministratorDto>> responseObject=new ResponseObject<>();
        responseObject.setCode(100003);
        responseObject.setMsg("SuperAdministrator");
        responseObject.setData(superAdministratorService.getList(dto));
        responseObject.setCount(superAdministratorService.selectCount());
        return responseObject;

    }
    /**
     * 添加管理员
     */
    @ResponseBody
    @RequestMapping(value = "/addSuperAdmin", method = RequestMethod.POST)
    public ResponseObject addSuperAdmin(@RequestBody SuperAdministratorDto dto){
        System.out.println("addSuperAdmin");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(superAdministratorService.addSuperAdministrator(dto)){
            System.out.println("添加成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(1);
            responseObject.setCode(103000);
        };
        return responseObject;
    }

    /**
     * 单次删除管理员
     */
    @ResponseBody
    @RequestMapping(value = "/deleteSuperAdmin/{superAdministratorId}", method = RequestMethod.GET)
    public ResponseObject deleteSuperAdmin(@PathVariable Long superAdministratorId){
        System.out.println("deleteSuperAdmin");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(superAdministratorService.deleteSuperAdministratorByIdDto(superAdministratorId)){
            System.out.println("删除成功！");
            responseObject.setMsg("delete_success");
            responseObject.setCount(1);
            responseObject.setCode(100300);
        };
        return responseObject;
    }

    /**
     * 全部删除管理员
     */
    @ResponseBody
    @RequestMapping(value = "/deleteAllSuperAdmin", method = RequestMethod.GET)
//	传入：http://localhost:8080/api/deleteAllUser?data=10,11,12,13,14
    public ResponseObject<String> deleteAllSuperAdmin(@RequestParam(value="data") Long[] data){
        System.out.println("deleteAllSuperAdmin:"+data.length);
        int count=0;
        ResponseObject<String> responseObject=new ResponseObject<>();
        for(Long item:data){
            if(superAdministratorService.deleteSuperAdministratorByIdDto(item)){
                count++;
                System.out.println("删除:"+item);
            }
        }
        if(data.length==count){
            System.out.println("删除所有成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(count);
            responseObject.setCode(110300);
        }
        return responseObject;
    }

    /**
     * 修改管理员信息
     */

    @ResponseBody
    @RequestMapping(value = "/editSuperAdmin", method = RequestMethod.POST)
    public ResponseObject editSuperAdmin(@RequestBody SuperAdministratorDto dto){
        System.out.println("editAdmin");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(superAdministratorService.updateSuperAdministrator(dto)){
            System.out.println("修改成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(1);
            responseObject.setCode(100030);
        };
        return responseObject;
    }

    // 游泳馆
    /**
     * 查询所有游泳馆
     */
//@RequestParam(value="page",defaultValue="1",required=true) int page,@RequestParam(value="limit",defaultValue="10",required=true) int limit
    @ResponseBody
    @RequestMapping(value = "/listSwimmingPool", method = RequestMethod.GET)
    private ResponseObject listSwimmingPool(@RequestParam(value="page",defaultValue="1",required=true) int page
            ,@RequestParam(value="limit",defaultValue="10",required=true) int limit) {
        System.out.println("listSwimmingPool");
        SwimmingPoolDto dto=new SwimmingPoolDto();
        dto.setLimit(limit);
        dto.setPage(page);
        ResponseObject<List<SwimmingPoolDto>> responseObject=new ResponseObject<>();
        responseObject.setCode(100005);
        responseObject.setMsg("SwimmingPool");
        responseObject.setData(swimmingPoolService.getList(dto));
        responseObject.setCount(swimmingPoolService.selectCount());
        return responseObject;
    }
    /**
     * 添加游泳馆
     */
    @ResponseBody
    @RequestMapping(value = "/addSwimmingPool", method = RequestMethod.POST)
    public ResponseObject addSwimmingPool(@RequestBody SwimmingPoolDto dto){
        System.out.println("addSwimmingPool");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(swimmingPoolService.addSwimmingPool(dto)){
            System.out.println("添加成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(1);
            responseObject.setCode(105000);
        };
        return responseObject;
    }

    /**
     * 单次删除游泳馆
     */
    @ResponseBody
    @RequestMapping(value = "/deleteSwimmingPool/{swimmingPoolId}", method = RequestMethod.GET)
    public ResponseObject deleteSwimmingPool(@PathVariable Long swimmingPoolId){
        System.out.println("deleteSwimmingPool");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(swimmingPoolService.deleteSwimmingPoolByIdDto(swimmingPoolId)){
            System.out.println("删除成功！");
            responseObject.setMsg("delete_success");
            responseObject.setCount(1);
            responseObject.setCode(100500);
        };
        return responseObject;
    }

    /**
     * 全部删除游泳馆
     */
    @ResponseBody
    @RequestMapping(value = "/deleteAllSwimmingPool", method = RequestMethod.GET)
//	传入：http://localhost:8080/api/deleteAllUser?data=10,11,12,13,14
    public ResponseObject<String> deleteAllSwimmingPool(@RequestParam(value="data") Long[] data){
        System.out.println("deleteAllSwimmingPool:"+data.length);
        int count=0;
        ResponseObject<String> responseObject=new ResponseObject<>();
        for(Long item:data){
            if(swimmingPoolService.deleteSwimmingPoolByIdDto(item)){
                count++;
                System.out.println("删除:"+item);
            };
        }
        if(data.length==count){
            System.out.println("删除所有成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(count);
            responseObject.setCode(110500);
        }
        return responseObject;
    }

    /**
     * 修改游泳馆信息
     */

    @ResponseBody
    @RequestMapping(value = "/editSwimmingPool", method = RequestMethod.POST)
    public ResponseObject editSwimmingPool(@RequestBody SwimmingPoolDto dto){
        System.out.println("editSwimmingPool");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(swimmingPoolService.updateSwimmingPool(dto)){
            System.out.println("修改成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(1);
            responseObject.setCode(100050);
        };
        return responseObject;
    }

    // 救生员
    /**
     * 查询所有救生员
     */
//@RequestParam(value="page",defaultValue="1",required=true) int page,@RequestParam(value="limit",defaultValue="10",required=true) int limit
    @ResponseBody
    @RequestMapping(value = "/listLifeguard", method = RequestMethod.GET)
    private ResponseObject listLifeguard(@RequestParam(value="page",defaultValue="1",required=true) int page
            ,@RequestParam(value="limit",defaultValue="10",required=true) int limit) {
        System.out.println("listLifeguard");
        LifeguardDto dto=new LifeguardDto();
        dto.setLimit(limit);
        dto.setPage(page);
        ResponseObject<List<LifeguardDto>> responseObject=new ResponseObject<>();
        responseObject.setCode(100004);
        responseObject.setMsg("Lifeguard");
        responseObject.setData(lifeguardService.getList(dto));
        responseObject.setCount(lifeguardService.selectCount());
        return responseObject;
    }
    /**
     * 添加救生员
     */
    @ResponseBody
    @RequestMapping(value = "/addLifeguard", method = RequestMethod.POST)
    public ResponseObject addLifeguard(@RequestBody LifeguardDto dto){
        System.out.println("addLifeguard");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(lifeguardService.addLifeguard(dto)){
            System.out.println("添加成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(1);
            responseObject.setCode(104000);
        };
        return responseObject;
    }

    /**
     * 单次删除救生员
     */
    @ResponseBody
    @RequestMapping(value = "/deleteLifeguard/{lifeguardId}", method = RequestMethod.GET)
    public ResponseObject deleteLifeguard(@PathVariable Long lifeguardId){
        System.out.println("deleteLifeguard");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(lifeguardService.deleteLifeguardByIdDto(lifeguardId)){
            System.out.println("删除成功！");
            responseObject.setMsg("delete_success");
            responseObject.setCount(1);
            responseObject.setCode(100400);
        };
        return responseObject;
    }

    /**
     * 全部删除救生员
     */
    @ResponseBody
    @RequestMapping(value = "/deleteAllLifeguard", method = RequestMethod.GET)
//	传入：http://localhost:8080/api/deleteAllUser?data=10,11,12,13,14
    public ResponseObject<String> deleteAllLifeguard(@RequestParam(value="data") Long[] data){
        System.out.println("deleteAllLifeguard:"+data.length);
        int count=0;
        ResponseObject<String> responseObject=new ResponseObject<>();
        for(Long item:data){
            if(lifeguardService.deleteLifeguardByIdDto(item)){
                count++;
                System.out.println("删除:"+item);
            };
        }
        if(data.length==count){
            System.out.println("删除所有成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(count);
            responseObject.setCode(110400);
        }
        return responseObject;
    }

    /**
     * 修改救生员信息
     */

    @ResponseBody
    @RequestMapping(value = "/editLifeguard", method = RequestMethod.POST)
    public ResponseObject editLifeguard(@RequestBody LifeguardDto dto){
        System.out.println("editLifeguard");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(lifeguardService.updateLifeguard(dto)){
            System.out.println("修改成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(1);
            responseObject.setCode(100040);
        };
        return responseObject;
    }



    // 游泳池
    /**
     * 查询所有游泳池
     */
//@RequestParam(value="page",defaultValue="1",required=true) int page,@RequestParam(value="limit",defaultValue="10",required=true) int limit
    @ResponseBody
    @RequestMapping(value = "/listNatatorium", method = RequestMethod.GET)
    private ResponseObject listNatatorium(@RequestParam(value="page",defaultValue="1",required=true) int page
            ,@RequestParam(value="limit",defaultValue="10",required=true) int limit) {
        System.out.println("listLifeguard");
        NatatoriumDto dto=new NatatoriumDto();
        dto.setLimit(limit);
        dto.setPage(page);
        ResponseObject<List<NatatoriumDto>> responseObject=new ResponseObject<>();
        responseObject.setCode(100006);
        responseObject.setMsg("Natatorium");
        responseObject.setData(natatoriumService.getList(dto));
        responseObject.setCount(natatoriumService.selectCount());
        return responseObject;
    }
    /**
     * 添加游泳池
     */
    @ResponseBody
    @RequestMapping(value = "/addNatatorium", method = RequestMethod.POST)
    public ResponseObject addNatatorium(@RequestBody NatatoriumDto dto){
        System.out.println("addNatatorium");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(natatoriumService.addNatatorium(dto)){
            System.out.println("添加成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(1);
            responseObject.setCode(105000);
        };
        return responseObject;
    }

    /**
     * 单次删除游泳池
     */
    @ResponseBody
    @RequestMapping(value = "/deleteNatatorium/{natatoriumId}", method = RequestMethod.GET)
    public ResponseObject deleteNatatorium(@PathVariable Long natatoriumId){
        System.out.println("deleteNatatorium");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(natatoriumService.deleteNatatoriumByIdDto(natatoriumId)){
            System.out.println("删除成功！");
            responseObject.setMsg("delete_success");
            responseObject.setCount(1);
            responseObject.setCode(100600);
        }
        return responseObject;
    }

    /**
     * 全部删除救生员
     */
    @ResponseBody
    @RequestMapping(value = "/deleteAllNatatorium", method = RequestMethod.GET)
//	传入：http://localhost:8080/api/deleteAllUser?data=10,11,12,13,14
    public ResponseObject<String> deleteAllNatatorium(@RequestParam(value="data") Long[] data){
        System.out.println("deleteAllNatatorium:"+data.length);
        int count=0;
        ResponseObject<String> responseObject=new ResponseObject<>();
        for(Long item:data){
            if(natatoriumService.deleteNatatoriumByIdDto(item)){
                count++;
                System.out.println("删除:"+item);
            };
        }
        if(data.length==count){
            System.out.println("删除所有成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(count);
            responseObject.setCode(110600);
        }
        return responseObject;
    }

    /**
     * 修改救生员信息
     */

    @ResponseBody
    @RequestMapping(value = "/editNatatorium", method = RequestMethod.POST)
    public ResponseObject editNatatorium(@RequestBody NatatoriumDto dto){
        System.out.println("editNatatorium");
        ResponseObject<String> responseObject=new ResponseObject<>();
        if(natatoriumService.updateNatatorium(dto)){
            System.out.println("修改成功！");
            responseObject.setMsg("OK");
            responseObject.setCount(1);
            responseObject.setCode(100060);
        };
        return responseObject;
    }
}
