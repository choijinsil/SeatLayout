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

import com.myway.seat.api.model.entity.User;
import com.myway.seat.api.model.param.UserParam;


@Mapper
public interface UserMapper {
	
	@Select("SELECT * FROM user")
	List<User> findAll();
	

    @Select("SELECT * FROM user WHERE account_id = #{accountId}")
    User findUserByAccountId(String accountId);

    // 쿼리를 분리한 메소드
    User findUserByAccountIdXml(String accountId);
    
    int saveUserXml(User user);
}