package com.myway.seat.api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.myway.seat.api.model.entity.Member;


/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	js
 * @since 	2018. 12. 10.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2018. 12. 10.		js				최초생성
 * 
 * </pre>
 */
@Mapper
public interface MemberMapper {

		// member테이블 전체 조회
		@Select("SELECT * FROM member")
		List<Member> findAll();
		
		@Select("SELECT * FROM member WHERE user_name =#{userName}")
		Member findMemberByUserName(String user_name);
		
		Member findMemberByUserNameXml(String user_name);
}
