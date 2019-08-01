package com.wzz.personal.feignService;

import com.wzz.personal.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @program: classification
 * @description: 用户暴露服务
 * @author: wzz
 * @create: 2019-07-31 14:20
 */
@FeignClient(value = "person",url = "127.0.0.1:8730/person",path = "/commons")
public interface UserServiceFeign {

   @PostMapping(value = "/addUser")
    public int addUser(@RequestBody User user);

}
