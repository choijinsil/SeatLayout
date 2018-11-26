package com.myway.seat.api.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myway.seat.api.model.entity.Item;
import com.myway.seat.api.model.entity.User;
import com.myway.seat.api.service.ItemService;
import com.myway.seat.api.service.UserService;
import com.myway.seat.common.annotion.ApiVersion;
import com.myway.seat.common.exception.BaseException;
import com.myway.seat.common.exception.MyCustomException;

import io.swagger.annotations.ApiOperation;

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
@RestController
@RequestMapping("/api")
@ApiVersion(1)
@CrossOrigin
public class ItemRestController {
	
	private final ItemService itemService;
	
	
	
	
	public ItemRestController(ItemService itemService) {
		super();
		this.itemService = itemService;
	}


	@ApiOperation(value="item 테이블 전체 조회")
	@RequestMapping(value = "/items", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<List<Item>> findUser() {
		List<Item> items = new ArrayList<Item>();
		try {
			items = itemService.findAll();
		} catch(Exception e) {
			e.printStackTrace();
			throw new MyCustomException();
		}
		return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
	}
	
	@ApiOperation(value="item 테이블 전체 조회")
	@RequestMapping(value = "/items/grp/{itemGrp}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<List<Item>> findItemByGroup(@PathVariable("itemGrp") String itemGrp) {
		List<Item> items = new ArrayList<Item>();
		try {
			items = itemService.findItemByGroup(itemGrp);
		} catch(Exception e) {
			e.printStackTrace();
			throw new MyCustomException();
		}
		return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
	}
	
	
	@ApiOperation(value="item 테이블 조회, 조건: item_id, xml 사용")
	@RequestMapping(value = "/items/{itemId}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<Item> findUser(@PathVariable("itemId") String itemId) {
		Item item;
		try {
			item = itemService.findItemById(itemId);
		} catch(Exception e) {
			e.printStackTrace();
			throw new MyCustomException();
		}
		return new ResponseEntity<Item>(item, HttpStatus.OK);
	}
	
	
	

}
