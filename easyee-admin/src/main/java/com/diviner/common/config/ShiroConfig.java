package com.diviner.common.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

@Configuration
public class ShiroConfig {

    @Bean
    public FilterRegistrationBean shiroFilterRegistration(){
        FilterRegistrationBean shiroFilterRegistration = new FilterRegistrationBean();
        //设置 拦截器
        shiroFilterRegistration.setFilter(new DelegatingFilterProxy("shiroFilter"));
        //该值缺省为false，表示生命周期由SpringApplicationContext管理，设置为true则表示由ServletContainer管理
        shiroFilterRegistration.addInitParameter("targetFilterLifecycle", "true");
        //启用拦截器
        shiroFilterRegistration.setEnabled(true);
        //设置拦截器执行级别
        shiroFilterRegistration.setOrder(Integer.MAX_VALUE - 1);
        //设置拦截器 拦截路由
        shiroFilterRegistration.addUrlPatterns("/*");
        return shiroFilterRegistration;
    }


}
