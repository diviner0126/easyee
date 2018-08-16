package com.diviner.modules.user.service.impl;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.diviner.entity.SysUser;
import com.diviner.modules.user.dao.UserDao;
import com.diviner.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao,SysUser> implements UserService {

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

    @Override
    public SysUser selectById(Long id) {
        new SysUser();
        this.selectObj(new com.baomidou.mybatisplus.mapper.Wrapper<SysUser>() {
            @Override
            public String getSqlSegment() {
                return null;
            }
        })
        SysUser sysUser = new SysUser().selectById();
        return  sysUser;
    }
}
