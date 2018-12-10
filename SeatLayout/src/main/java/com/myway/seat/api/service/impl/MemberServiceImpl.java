package com.myway.seat.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.javassist.compiler.ast.Member;

import com.myway.seat.api.mapper.MemberMapper;
import com.myway.seat.api.service.MemberService;

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

public class MemberServiceImpl implements MemberService {
	
	private final MemberMapper memberMapper;
	
	public MemberServiceImpl(MemberMapper memberMapper){
		super();
		this.memberMapper=memberMapper;
	}

	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return memberMapper.findAll();
	}

	@Override
	public Member findMemberByUserName(String user_name) {
		
		return Optional
				.ofNullable(memberMapper.findMemberByUserName(user_name))
				.orElseGet(Member::new);
		
	}

	@Override
	public Member findMemberByXml(String user_name) {
		// TODO Auto-generated method stub
		return Optional
				.ofNullable(memberMapper.findMemberByUserNameXml(user_name))
				.orElseGet(Member::new);
	}

	

}
