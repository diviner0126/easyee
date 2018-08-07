package com.diviner.modules.sys;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class PageController {
    private static final Log LOG = LogFactory.getLog(PageController.class);

    @RequestMapping("/**/*.html")
    public String module(HttpServletRequest request){
        String contextPath = request.getContextPath();
        String requestURI = request.getRequestURI();
        requestURI = requestURI.replace(contextPath+"/","");
        return requestURI;
    }

    @RequestMapping({"/","index.html"})
    public String index() {
        System.out.println(123);
        return "login.html";
    }
}
