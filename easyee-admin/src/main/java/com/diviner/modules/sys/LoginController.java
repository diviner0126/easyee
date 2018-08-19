package com.diviner.modules.sys;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.diviner.common.R;
import com.diviner.entity.SysUserEntity;
import com.diviner.modules.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("login")
    public R login() {
        return R.ok();
    }

    @RequestMapping("test")
    public R test() {
        SysUserEntity sysUserEntity1 = new SysUserEntity();
       // PageHelper.startPage(0,1);
        Page<SysUserEntity> sysUserEntityPage = new Page<>();
        return R.ok().put("data", sysUserService.selectPage(sysUserEntityPage));
    }

    @RequestMapping("test1")
    public R test1(long id) {
        return R.ok().put("data", sysUserService.selectById(id));
    }
}
