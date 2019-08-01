package com.wzz.personal.feignService;

import com.wzz.personal.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

}
