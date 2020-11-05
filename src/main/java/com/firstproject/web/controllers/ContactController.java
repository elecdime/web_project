package com.firstproject.web.controllers;

import com.firstproject.web.repository.Mapper_User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ContactController {
    private final Mapper_User mapper_user;

    public ContactController(Mapper_User mapper_user) {
        this.mapper_user = mapper_user;
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("head_title", "register");
        return "register";
    }
    @PostMapping("/doRegister")
        public String DoRegister(HttpServletRequest request,Model model){
            model.addAttribute("head_title", "DoRegister");

          mapper_user.insertUserInfo(
                  request.getParameter("userAccount"),
                  request.getParameter("userPassword"),
                  request.getParameter("userName"),
                  request.getParameter("userGender"),
                  request.getParameter("userEmail"));

           return "index";
        }


}
