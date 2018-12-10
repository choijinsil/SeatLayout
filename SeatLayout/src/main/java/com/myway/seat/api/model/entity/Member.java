package com.myway.seat.api.model.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

import lombok.Data;

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
@Data
@Alias("Member")
public class Member implements Serializable {

	private static final long serialVersionUID=1L;
	private Long id;
	private String passwoed;
	private String user_name;
	private String phone_nm;
	private Timestamp create_date;
	
}
