package com.diviner.modules.sys;

import com.diviner.common.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("login")
    public R login(){
        return R.ok();
    }
}
