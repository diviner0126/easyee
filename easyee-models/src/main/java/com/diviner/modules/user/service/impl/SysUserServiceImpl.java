package com.diviner.modules.user.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.diviner.entity.SysUser;
import com.diviner.modules.user.dao.SysUserDao;
import com.diviner.modules.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserDao,SysUser> implements SysUserService {

    @Autowired
    private SysUserDao userDao;

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
        SysUser sysUser = new SysUser();
        sysUser.setUserId(12L);sysUser.setUsername("234234");
        userDao.insert(sysUser);
        return  sysUser;
    }
}
