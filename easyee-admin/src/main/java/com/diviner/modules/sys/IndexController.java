package com.diviner.modules.sys;

import com.diviner.common.R;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    private static final Log LOG = LogFactory.getLog(IndexController.class);

    @ResponseBody
    @RequestMapping({"/","index","index.html"})
    public R index() {
        return R.ok();
    }
}
