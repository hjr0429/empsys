package com.lanqiao.empsys.controller;


import com.lanqiao.empsys.domain.User;
import com.lanqiao.empsys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {


    @Autowired
    IUserService userService;

    @GetMapping("/")
    public String index(){
        return "login";
    }

    @PostMapping("/user/login")
    public String login(User user){
        User userLogin = this.userService.selectById(user);
        if (userLogin != null) {
            return "redirect:/employees";
        }
        return "redirect:/";
    }
}
