package com.myway.seat.web;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myway.bean.NameBean;

/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author js
 * @since 2018. 11. 20.
 * @version 1.0
 * @see
 * 
 *      <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2018. 11. 20.		js				최초생성
 * 
 *      </pre>
 */
@RestController
public class TestRestController {
	// 화면에 값이 바로 나오게 할때 rest를 사용한다.
	// 메이븐 종속성 추가시, maven update, clean, install해줘야 한다. 이때 에러가 안나면 사용가능한 것이다.
	// 이 데이터를 화면에 뿌려줘.
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "hello";
	}

	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public List<String> test1() {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("22");
		list.add("333");
		list.add("4444");

		return list;
	}

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String test(String name) {
		return "by";
	}	

	// 같은것으론 GetMapping이 있음.
	@RequestMapping(value = "/test_choice", method = RequestMethod.GET)
	public List<NameBean> testChoice() {
		
		NameBean nameBean=new NameBean();
		// generic 
		// 클래스를 다시 만들땐 재시작 해줘야 함.
		List<NameBean> list = new ArrayList<NameBean>();
		
		nameBean.setFirstName("my siri");
		nameBean.setLastName("choi");
		list.add(nameBean);
		
		nameBean=new NameBean();
		
		
		nameBean.setFirstName("iloveu");
		nameBean.setLastName("cho");
		list.add(nameBean);
		
		
		return list;
	}

//	@RequestMapping(value = "/test_list", method = RequestMethod.GET)
//	public ClassBean testList(){
//		//testChoice();
//		ClassBean classBean=new ClassBean();
//		classBean.setFirstName("iloveyou");
//		classBean.setLastName("cho");
//		return classBean;
//	}
	
}
	