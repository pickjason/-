package com.wzz.order.restController;

import com.wzz.order.feign.UserFeign;
import com.wzz.personal.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: classification
 * @description: rest接口
 * @author: wzz
 * @create: 2019-07-31 16:12
 */
@RestController
@RequestMapping("/order")
public class restfulController {

    @Autowired
   private UserFeign userServiceFeign;

     @PostMapping("/addUser")
     public String addUser(@RequestBody User user) {
         User userByName = userServiceFeign.getUserByName(user.getName());
         if (null == userByName) {
             int i = userServiceFeign.addUser(user);
             if (i > 0) {
                 return "success";
             } else {

                 return "error";
             }
         }
         return "已经有该名称";
     }


}
