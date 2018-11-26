package com.myway.seat.api.mapper;

import java.util.List;
import java.util.Optional;

/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	sjc0502
 * @since 	2018. 11. 26.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2018. 11. 26.		sjc0502				최초생성
 * 
 * </pre>
 */

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.myway.seat.api.model.entity.Item;
import com.myway.seat.api.model.entity.User;


@Mapper
public interface ItemMapper {
	
	
	List<Item> findAll();
	
	List<Item> findItemByGroup(String itemGrp);
	
	Item findItemById(String userId);

}