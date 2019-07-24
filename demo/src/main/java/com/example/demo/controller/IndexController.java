package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import javax.annotation.Resource;
import  java.util.List;

@RestController
public class IndexController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "index";
    }

    @Resource
    private UserDao userdao;

    @GetMapping(value = "/users")
    public List<User> get_all_user() {
        return userdao.findAll();
    }

}
