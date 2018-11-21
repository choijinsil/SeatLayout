package com.myway.seat.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	sjc0502
 * @since 	2018. 11. 21.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2018. 11. 21.		sjc0502				최초생성
 * 
 * </pre>
 */
@Controller
public class TestController {
	
	@RequestMapping(value="/test-page", method=RequestMethod.GET)
	public String test() {
		return "test";
	}

}
