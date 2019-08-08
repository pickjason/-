package com.wzz.personal.restfulController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wzz.personal.entity.User;
import com.wzz.personal.service.IUserService;
import entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @program: classification
 * @description: 用户rest接口
 * @author: wzz
 * @create: 2019-08-08 11:35
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @PostMapping("/login")
    public Result userLogin(@RequestBody User user) {
       QueryWrapper<User> wrapper=new QueryWrapper<>();
       wrapper.eq("name",user.getName());
        User one = iUserService.getOne(wrapper);

        if (null!=one&&one.getPassworld().equals(user.getPassworld())){
            return new Result("登录成功",200);
        }else{
            return new Result("失败请检查你的账号和密码",201);
        }

    }

}
