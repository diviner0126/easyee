package com.diviner.modules.user.service.impl;

import com.diviner.entity.SysUser;
import com.diviner.modules.user.dao.UserDao;
import com.diviner.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<SysUser> getUserAll() {
        return userDao.getUserAll();
    }

    @Override
    public List<Map<String, Object>> getUserAll1() {
        return userDao.getUserAll1();
    }
}
