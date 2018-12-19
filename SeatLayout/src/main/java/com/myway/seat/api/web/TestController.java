package com.myway.seat.api.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	js
 * @since 	2018. 11. 20.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2018. 11. 20.		js				최초생성
 * 
 * </pre>
 */
// 리턴되는 화면이 있으면 Controller 아니면 RestController
@Controller
public class TestController {
	//thymeleaf 테스트용
	@RequestMapping("/test_thymeleaf")
	public String test(){
		System.out.println("asd");
		System.out.println("내가추가");
		return "thymeleaf/test";
	}
	
	//jsp 테스트용
	@RequestMapping("/test_jsp")
	public String test_jsp(){
		System.out.println("jsp");
		System.out.println("jsp 추가연결");
		return "jsp/test";
	}
}
