/**
* <pre>
* com.pcwk.exception.ex03.multiblock
* Class Name : MultiBlockExceptionMain.java
* Description: JDK 1.7부터 여러 catch블럭을 | 기호를 이용해서, 하나의 catch 블록으로 합칠 수 있다.
* Author: ITSC
* Since: 2022/02/21
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/21 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.exception.ex03.multiblock;

import com.pcwk.cmn.LoggerManager;

public class MultiBlockExceptionMain02 implements LoggerManager {

	// JDK 1.7부터 여러 catch블럭을 | 기호를 이용해서, 하나의 catch 블록으로 합칠 수 있다.
	public static void main(String[] args) {
		LOG.debug("1");
		LOG.debug("2");
		int[] intArray = {1,2,0,3};
		
		try {
			LOG.debug("3");
			LOG.debug(1/intArray[4]); // 예외 발생
			LOG.debug("4"); // 수행되지 않음
			
			// jdk 1.7 이후 가능
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) { // 예상되는 예외
			// LOG.debug("5 "+ e.getMessage());
			if(e instanceof ArithmeticException) {
				LOG.debug("5. ArithmeticException: " + e.getMessage());
			}else if(e instanceof ArrayIndexOutOfBoundsException) {
				LOG.debug("5. ArrayIndexOutOfBoundsException: "+e.getMessage());
			}
		}catch(Exception e) { // 그외 모든 예외
			LOG.debug("6 Exception");
		}finally {
			LOG.debug("7 finally");
		}
		LOG.debug("8 종료");
	}

}
//2022-02-21 10:35:08,182 DEBUG [main] cmn.LoggerManager (MultiBlockExceptionMain02.java:25)     - 1
//2022-02-21 10:35:08,183 DEBUG [main] cmn.LoggerManager (MultiBlockExceptionMain02.java:26)     - 2
//2022-02-21 10:35:08,183 DEBUG [main] cmn.LoggerManager (MultiBlockExceptionMain02.java:30)     - 3
//2022-02-21 10:35:08,183 DEBUG [main] cmn.LoggerManager (MultiBlockExceptionMain02.java:40)     - 5. ArrayIndexOutOfBoundsException: 4
//2022-02-21 10:35:08,183 DEBUG [main] cmn.LoggerManager (MultiBlockExceptionMain02.java:45)     - 7 finally
//2022-02-21 10:35:08,183 DEBUG [main] cmn.LoggerManager (MultiBlockExceptionMain02.java:47)     - 8 종료
