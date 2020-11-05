package com.firstproject.web.controllers;

import com.firstproject.web.repository.Mapper_User;
import com.firstproject.web.utillty.Commons;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;

//스프링 부트 컨트롤러 어노테이션
@Controller
public class IndexController {
    //초기화 내부에서 쓸 바구니
    private final Mapper_User _mapperUser;
    //생성자 전역 바구니에 객체를 담는다.
    public IndexController(Mapper_User _mapperUser) {
        this._mapperUser = _mapperUser;
    }

    //분기처리
    @GetMapping("/")
    //HttpServletRequest 와 Model활용하겠다.
    public String Index(HttpServletRequest request, Model model) {
        //HttpServletRequest의 함수인 getRemoteAddr()를 호출을 하여 활용하겠다.
        String userAddress = request.getRemoteAddr();
        //Commons 클래스에있는 GetDateTime함수를 호출을하여 시간을 구하겠다.
        String execDateTime = new Commons().GetDateTime();
        //Mapper_User 인터페이스가 갖고있는 insertConnection_Log 라는 함수를 호출하는데 매개변수2개를 원하고있다
        //그래서 ip주소와 시간을 구한 것을 던져줬다
        int result = _mapperUser.insertConnection_Log(userAddress, execDateTime);
        //그래서 처리된 결과가 1이면 정상이고 다른값이면 접근 불가

        //head.mustache 에 정의한 head_title를 지정하겠다.
        model.addAttribute("head_title","Index");

        if (result == 1) return "index";
        else return "denied";
    }

}







