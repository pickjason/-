package com.wzz.personal.feignService;

import com.wzz.personal.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @program: classification
 * @description: 用户暴露服务
 * @author: wzz
 * @create: 2019-07-31 14:20
 */
@RestController
public interface UserServiceFeign {

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
   int addUser(@RequestBody User user);

    @GetMapping("/getUser")
    User getUserByName(@RequestParam("name") String name);

}
