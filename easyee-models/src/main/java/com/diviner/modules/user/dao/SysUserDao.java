package com.diviner.modules.user.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.diviner.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface SysUserDao extends BaseMapper<SysUser> {
    List<SysUser> getUserAll();
    List<Map<String,Object>> getUserAll1();
}
