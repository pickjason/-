package com.wzz.personal.feignService.feignImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wzz.personal.entity.User;
import com.wzz.personal.feignService.UserServiceFeign;
import com.wzz.personal.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: classification
 * @description: 暴露接口服务实现类
 * @author: wzz
 * @create: 2019-07-31 16:03
 */
@Service
public class UserServiceFeignImpl implements UserServiceFeign {
    @Autowired
    private IUserService iUserService;

    @Override
    public int addUser(User user) {
        return iUserService.save(user)==true ? 1:0;
    }

    @Override
    public User getUserByName(String name) {
        QueryWrapper<User>queryWrapper =new QueryWrapper<>();
        queryWrapper.eq("name",name);
        return iUserService.getOne(queryWrapper);
    }
}
