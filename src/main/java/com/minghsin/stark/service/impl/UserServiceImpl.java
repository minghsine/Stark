package com.minghsin.stark.service.impl;

import com.minghsin.stark.entity.User;
import com.minghsin.stark.mapper.UserMapper;
import com.minghsin.stark.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author minghsin
 * @since 2021-01-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
