package com.firstproject.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class IndexController {

    @GetMapping("/")
    public String Index(HttpServletRequest request) {
     String testDate = request.getRemoteAddr();
        return testDate;
    }

}
