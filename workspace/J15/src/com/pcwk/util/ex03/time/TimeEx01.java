/**
* <pre>
* com.pcwk.util.ex03.time
* Class Name : TimeEx01.java
* Description:
* Author: ITSC
* Since: 2022/02/23
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/23 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex03.time;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeEx01 {

//	LocalDate + LocalTime -> LocalDateTime								
//	날짜			시간			 날짜 + 시간		
//
//	time-zone										
//	LocalDateTime + 시간대 -> ZonedDateTime									
	
//	객체 생성하기 : now(), of()
//	now() : 현재 날짜와 시간을 저장하는 객체 생성
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); 	// 날짜
		LocalTime time = LocalTime.now();	// 시간
		
		System.out.println("today: "+today.toString()); // today: 2022-02-23
		System.out.println("today: "+time.toString());
		
		LocalDate localD = today.minusYears(2) // 2년 빼기		
							    .plusMonths(3) // 3개월 더하기
							    .minusDays(3)  // 3일 빼기
			;
		System.out.println("localD: "+ localD); // localD: 2020-05-20
		
		// 주 더하기
		LocalDate localD02 = today.plusWeeks(1);
		System.out.println(localD02);
	}

}
