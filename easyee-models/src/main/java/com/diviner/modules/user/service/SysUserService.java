package com.diviner.modules.user.service;

import com.baomidou.mybatisplus.service.IService;
import com.diviner.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface SysUserService extends IService<SysUser> {

    List<SysUser> getUserAll();

    List<Map<String,Object>> getUserAll1();
    SysUser selectById(Long id);
}
