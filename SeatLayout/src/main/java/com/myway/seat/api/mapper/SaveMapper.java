package com.myway.seat.api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.myway.seat.api.model.entity.Buy;
import com.myway.seat.api.model.entity.Save;

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
@Mapper
public interface SaveMapper { 
	@Select("select * from save")
	List<Save> findAll();

	//Object findSaveById(String itemId);
	@Select("select * from save WHERE item_id=#{itemId}")
	Save findSaveById(String itemId);
	
	@Select("select * from save WHERE item_price >=#{itemPrice}")
	// 여러건은 리스트로 넘겨받기
	List<Save> findSaveByPrice(String itemPrice);
	
}
 