package com.javaclimb.drug.controller;

import com.javaclimb.drug.common.ResultMapUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName UserController.java
 * @Description TODO 用户相关的controller
 * @createTime 2021年10月02日 09:05:00
 */

@Controller
public class UserController {
    /**
     * 转向登录页面
     * @return
     */
    @RequestMapping(value = "/login")
    public String login(){
        return "/login";
    }
    /**
     * 判断用户登陆是否成功
     */
    @RequestMapping(value = "/toLogin")
    @ResponseBody
    public Object toLogin(String username,String password){
        return ResultMapUtil.getHashMapLogin("验证成功","1");
    }

    /**
     * 转向后台首页
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(){
        return "/index";
    }
}
