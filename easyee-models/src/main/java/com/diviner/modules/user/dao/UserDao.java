package com.diviner.modules.user.dao;

import com.diviner.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface UserDao {
    List<SysUser> getUserAll();
    List<Map<String,Object>> getUserAll1();
}
