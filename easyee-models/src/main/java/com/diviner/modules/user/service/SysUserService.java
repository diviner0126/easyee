package com.diviner.modules.user.service;

import com.baomidou.mybatisplus.service.IService;
import com.diviner.entity.SysUserEntity;

import java.util.List;
import java.util.Map;

public interface SysUserService extends IService<SysUserEntity> {

    List<SysUserEntity> getUserAll();

    List<Map<String,Object>> getUserAll1();
    Object selectById(Long id);
}
