package cn.sk.consumer.controller;

import cn.sk.api.pojo.User;
import cn.sk.api.service.IUserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Reference(version = "1.0.0")
    private IUserService userService;

    @GetMapping("/hello")
    public String hello() {
        return userService.sayHello("Hello springboot and dubbo!");
    }

    @GetMapping("/findUser")
    public User user() {
        return userService.findUser();
    }
}
