package com.myway.seat.api.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myway.seat.api.model.param.LoginParam;

// @설정이유 - 스프링의 컨트롤러다. 라는 객체 생성 , 설정이 포함되어 있
@Controller
public class LoginController {
	
	// login.do입력되만 아래 메소드 실행, get 요청시에만 // post면 에러가 난다.
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginPage(Model model) {
		model.addAttribute("login", "login"); // 모델의 키 벨류에 값을 담아 jsp 페이지로 넘긴다.
		
		return "jsp/login/login"; 
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(LoginParam loginParam) {
		System.out.println(loginParam);
		return "jsp/login/login_p";
	}
	
	public void test() {
		
	}

}
