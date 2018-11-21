package com.myway.seat.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

@RestController
public class TestRestController {
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test() {
		return "test - restcontroller";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.POST)
	public String test(String name) {
		return name + ": 여기는 Post로만 호출 가능";
	}
	
	@RequestMapping(value="/test-list", method=RequestMethod.GET)
	public List<String> testList() {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("22");
		list.add("333");
		list.add("4444");
		return list;
	}
}
