package com.wzz.order.restController;

import com.wzz.personal.entity.User;
import com.wzz.personal.feignService.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: classification
 * @description: rest接口
 * @author: wzz
 * @create: 2019-07-31 16:12
 */
@RestController
public class restfulController {
    @Autowired
   private UserServiceFeign userServiceFeign;

     @PostMapping("/addUser")
     public String addUser(@RequestBody User user){
         System.out.println(user.getName());
         int i = userServiceFeign.addUser(user);
         if (i>0){
             return "success";
         }else {

             return "error";
         }
     }

}
