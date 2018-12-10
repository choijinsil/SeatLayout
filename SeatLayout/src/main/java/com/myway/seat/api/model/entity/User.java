package com.myway.seat.api.model.entity;

import lombok.Data;

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

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Data
@Alias("User")
public class User implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	
	private Long 	id;
	private String 	accountId;
	private String 	userNm;
	private Boolean enabled;
	
    
}