package com.myway.seat.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.myway.seat.api.mapper.ItemMapper;
import com.myway.seat.api.mapper.UserMapper;
import com.myway.seat.api.model.entity.Item;
import com.myway.seat.api.model.entity.User;
import com.myway.seat.api.service.ItemService;
import com.myway.seat.api.service.UserService;

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

@Service
public class ItemServiceImpl implements ItemService {
	
	private final ItemMapper itemMapper;

	public ItemServiceImpl(ItemMapper itemMapper) {
		super();
		this.itemMapper = itemMapper;
	}

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return itemMapper.findAll();
	}

	@Override
	public Item findItemById(String itemId) {
		// TODO Auto-generated method stub
		return Optional
				.ofNullable(itemMapper.findItemById(itemId))
				.orElseGet(Item::new);
	}

	@Override
	public List<Item> findItemByGroup(String itemGrp) {
		// TODO Auto-generated method stub
		return itemMapper.findItemByGroup(itemGrp);
	}
	
	

}
