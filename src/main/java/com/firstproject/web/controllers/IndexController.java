package com.firstproject.web.controllers;

import com.firstproject.web.Repository.PostsRepository;
import com.firstproject.web.modul.PostsSaveRequestDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

//스프링 부트 컨트롤러 어노테이션
@Controller
public class IndexController {
    private PostsRepository postsRepository;
    //분기처리
    @GetMapping("/")
    //HttpServletRequest 와 Model활용하겠다.
    public String Index(HttpServletRequest request, Model model) {

        model.addAttribute("head_title","Index");

       return "index";
    }
    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }

}







