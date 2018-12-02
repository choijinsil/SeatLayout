package com.myway.seat.api.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myway.seat.api.model.entity.Buy;
import com.myway.seat.api.service.BuyService;

/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	js
 * @since 	2018. 11. 30.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2018. 11. 30.		js				최초생성
 * 
 * </pre>
 */
@RestController

public class BuyRestController  {
	
	@Autowired
	private BuyService buyService;
	
	@RequestMapping(value="/buyList", method=RequestMethod.GET)
	public List<Buy> buyList(){
		
		return buyService.findAll();
	}
}
