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

import com.myway.seat.api.model.entity.User;
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
public class UserRestController {
	
	private final UserService userService;
	
	
	
	
	public UserRestController(UserService userService) {
		super();
		this.userService = userService;
	}


	@ApiOperation(value="user 테이블 전체 조회")
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<List<User>> findUser() {
		List<User> users = new ArrayList<User>();
		try {
			users = userService.findAll();
		} catch(Exception e) {
			e.printStackTrace();
			throw new MyCustomException();
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	@ApiOperation(value="user 테이블 조회, 조건: accountId, Mapper class 내부에서 sql 사용")
	@RequestMapping(value = "/users/{accountId}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<User> findUser(@PathVariable("accountId") String accountId) {
		User user;
		try {
			user = userService.findUserById(accountId);
		} catch(Exception e) {
			e.printStackTrace();
			throw new MyCustomException();
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@ApiOperation(value="user 테이블 조회, 조건: user_id, xml 분리 방식1 - resultType 객체를 entity의 Alias방식으로 설정함")
	@RequestMapping(value = "/users/{accountId}/xml", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<User> findUserByIdXml(@PathVariable("accountId") String accountId) {		
		User user;
		try {
			user = userService.findUserByIdXml(accountId);
		} catch(Exception e) {
			e.printStackTrace();
			throw new MyCustomException();
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

}
