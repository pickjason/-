package com.wzz.order.feign;

import com.wzz.personal.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @program: classification
 * @description: feign
 * @author: wzz
 * @create: 2019-08-01 10:38
 */

@FeignClient(value = "person")
public interface UserFeign {

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    int addUser(@RequestBody User user);

   @GetMapping("/getUser")
    User getUserByName(@RequestParam("name") String name);

}
