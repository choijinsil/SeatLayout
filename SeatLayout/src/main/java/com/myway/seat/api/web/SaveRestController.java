package com.myway.seat.api.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myway.seat.api.model.entity.Save;
import com.myway.seat.api.service.SaveService;
import com.myway.seat.common.exception.MyCustomException;

import io.swagger.annotations.ApiOperation;

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
@RestController
public class SaveRestController {
	@Autowired
	private SaveService saveService;
	
	@RequestMapping(value="/saveList",method=RequestMethod.GET)
	public List<Save> saveList(){
		return saveService.findAll();
	}
	
	@ApiOperation(value="save 테이블 조회, 조건: item_id, xml 사용")
	@RequestMapping(value="/save/{itemId}", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<Save> findUser(@PathVariable("itemId") String itemId){
		Save save;
		try{
			save=saveService.findSaveById(itemId);
		}catch (Exception e) {
			e.printStackTrace();
			throw new MyCustomException();
		}
		return new ResponseEntity<Save>(save, HttpStatus.OK);
	}
	
	@ApiOperation(value="400 원 이상의 price보여주기")
	@RequestMapping(value="/save/price/{itemPrice}", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<List<Save>> upTo400(@PathVariable("itemPrice") String itemPrice){
		List<Save> save;
		try{
			save=saveService.findSaveByPrice(itemPrice);
		}catch (Exception e) {
			e.printStackTrace();
			throw new MyCustomException();
		}
		return new ResponseEntity<List<Save>>(save, HttpStatus.OK);
	}
}
