package com.myway.seat.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myway.seat.api.mapper.BuyMapper;
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
@Service
public class BuyServiceImpl implements BuyService{
	
	// 변수 선언시 new를 사용하지 않는다.
	@Autowired
	private BuyMapper buyMapper;
	

	@Override
	public List<Buy> findAll() {
		// TODO Auto-generated method stub
		return buyMapper.findAll();
	}
	
	
}
