package com.myway.seat.api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.myway.seat.api.model.entity.Buy;

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
@Mapper
public interface BuyMapper {
	// buy테이블의 모든걸 보여주기.
	@Select("select * from buy")
	List<Buy> findAll();
	
}
