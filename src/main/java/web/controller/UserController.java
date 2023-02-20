package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import web.model.User;
import web.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController implements WebMvcConfigurer {


    @Autowired
    UserService serv;

    @GetMapping(value = "/")
    public String showAllUsers(Model model) {
        model.addAttribute("users", serv.getAllUser());
        return "users";
    }
}
