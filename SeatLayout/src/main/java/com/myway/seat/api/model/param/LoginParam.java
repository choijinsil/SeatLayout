package com.myway.seat.api.model.param;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

import lombok.Data;

// lombok 이 설치되어 있다면 @Data 사용가능
// getter setter tostring 이 자동으로 적용된다. 
// 서버로 데이터 전달 
@Data
public class LoginParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String pwd;

	

}
