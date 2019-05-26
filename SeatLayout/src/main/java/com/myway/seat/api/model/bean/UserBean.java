package com.myway.seat.api.model.bean;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	sjc0502
 * @since 	2018. 12. 4.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2018. 12. 4.		sjc0502				최초생성
 * 
 * </pre>
 */

//사용자에게만 보내주는 정보라 pass필요 없음 
@Data
@ToString(callSuper=true)
public class UserBean implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="user sequence")
	private Long 	id;
	@ApiModelProperty(value="user 계정 ID")
	private String 	accountId;
	@ApiModelProperty(value="user 이름")
	private String 	userNm;
	@ApiModelProperty(value="user 계정 사용 유무")
	private Boolean enabled;
	
}
