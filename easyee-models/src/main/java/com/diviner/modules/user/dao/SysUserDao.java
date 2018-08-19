package com.diviner.modules.user.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.diviner.entity.SysUserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface SysUserDao extends BaseMapper<SysUserEntity> {
    List<SysUserEntity> getUserAll();
    List<Map<String,Object>> getUserAll1();
}
