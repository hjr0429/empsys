package com.lanqiao.empsys.controller;


import com.lanqiao.empsys.domain.User;
import com.lanqiao.empsys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"loginUser"})//讲model中相同key的对象同步一份到HttpSession
public class UserController {


    @Autowired
    IUserService userService;

    @GetMapping("/")
    public String index(){
        return "login";
    }

    @PostMapping("/user/login")
    public String login(User user, Model model){
        User userLogin = this.userService.selectById(user);
        if (userLogin != null) {
            model.addAttribute("loginUser",user);
            return "redirect:/employees";
        }
        return "redirect:/";
    }
}
