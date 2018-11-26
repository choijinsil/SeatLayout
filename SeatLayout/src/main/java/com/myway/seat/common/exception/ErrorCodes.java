package com.myway.seat.common.exception;

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

public enum ErrorCodes {
	ERROR_GLOBAL("에러가 발생했습니다. Global Exception Message"),
	ERROR_REQUIRED_CHECK("필수 값을 체크하세요."),
	ERROR_ID_REDUPLICATION("ID가 중복되었습니다.");
	
	private String msg;
	
	ErrorCodes(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
}
