package com.diviner.modules.sys;

import com.diviner.common.R;
import com.diviner.modules.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private SysUserService userService;

    @RequestMapping("login")
    public R login() {
        return R.ok();
    }

    @RequestMapping("test")
    public R test() {
        return R.ok().put("data", userService.getUserAll());
    }

    @RequestMapping("test1")
    public R test1(long id) {
        return R.ok().put("data", userService.selectById(id));
    }
}
