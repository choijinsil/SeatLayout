package com.myway.seat.api.model.bean;

import java.io.Serializable;

import lombok.Data;

// 사용자 로그인 후 화면에 표시해 줄 정보

@Data
public class MemberBean implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private String id;

}
