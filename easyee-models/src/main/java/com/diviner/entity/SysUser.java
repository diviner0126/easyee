package com.diviner.entity;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

public class SysUser extends Model<SysUser> {
    private Long userId;
    private String username;
    private String password;
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
