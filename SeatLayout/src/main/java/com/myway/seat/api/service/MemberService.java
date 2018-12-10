package com.myway.seat.api.service;

import java.util.List;

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

public interface MemberService {
	List<Member> findAll();
	
	Member findMemberByUserName(String user_name);
	Member findMemberByXml(String user_name);

}
