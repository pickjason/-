package com.wzz.personal.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzz.personal.entity.User;
import com.wzz.personal.mapper.UserMapper;
import com.wzz.personal.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wzz
 * @since 2019-07-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
