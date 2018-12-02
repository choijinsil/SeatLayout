package com.myway.seat.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myway.seat.api.mapper.SaveMapper;
import com.myway.seat.api.model.entity.Save;
import com.myway.seat.api.service.SaveService;

/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	js
 * @since 	2018. 12. 2.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2018. 12. 2.		js				최초생성
 * 
 * </pre>
 */
@Service
public class SaveServiceImpl implements SaveService {
	
	// 변수 선언시  new를 사용하지 않는다.
	@Autowired
	private SaveMapper SaveMapper;

	@Override
	public List<Save> findAll() {
		// TODO Auto-generated method stub
		return SaveMapper.findAll();
	}
	public Save findSaveById(String itemId){
		return Optional
				.ofNullable(SaveMapper.findSaveById(itemId))
				.orElseGet(Save::new);	
	}

	public List<Save> findSaveByPrice(String itemPrice){
		return SaveMapper.findSaveByPrice(itemPrice);
	}
}
