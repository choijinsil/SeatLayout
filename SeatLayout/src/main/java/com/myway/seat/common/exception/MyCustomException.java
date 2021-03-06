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

public class MyCustomException extends BaseException {
	
	

	public MyCustomException() {		
		this(ErrorCodes.ERROR_GLOBAL.getMsg());
	}
	
	
	//Message만 담는 Exception을 담당하는 메서드
	public MyCustomException(String msg) {		
		super(msg);		
		
	}	

}
