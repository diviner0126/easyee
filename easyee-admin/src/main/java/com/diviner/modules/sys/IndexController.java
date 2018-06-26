package com.diviner.modules.sys;

import com.diviner.common.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @ResponseBody
    @RequestMapping({"/","index","index.html"})
    public R index() {
        return R.ok();
    }
}
