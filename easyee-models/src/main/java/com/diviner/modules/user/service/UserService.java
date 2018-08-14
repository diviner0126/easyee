package com.diviner.modules.user.service;

import com.diviner.entity.SysUser;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<SysUser> getUserAll();

    List<Map<String,Object>> getUserAll1();
}
