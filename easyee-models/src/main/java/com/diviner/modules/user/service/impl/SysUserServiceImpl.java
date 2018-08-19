package com.diviner.modules.user.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.diviner.entity.SysUserEntity;
import com.diviner.modules.user.dao.SysUserDao;
import com.diviner.modules.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserDao,SysUserEntity> implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public List<SysUserEntity> getUserAll() {

        return sysUserDao.getUserAll();
    }

    @Override
    public List<Map<String, Object>> getUserAll1() {
        return sysUserDao.getUserAll1();
    }

    @Override
    public Object selectById(Long id) {

        return  sysUserDao.getUserAll1();
    }
}
