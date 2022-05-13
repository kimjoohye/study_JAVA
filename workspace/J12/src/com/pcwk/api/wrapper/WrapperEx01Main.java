package com.pcwk.api.wrapper;

import org.apache.log4j.Logger;

public class WrapperEx01Main {
	final static Logger LOG = Logger.getLogger(WrapperEx01Main.class);
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
//		래퍼 클래스 -> 기본 자료형								
//		자료형이름 + Value()							
//			Integer i = new Integer(100);
		Integer iValue = new Integer(100);
		int myValue = iValue.intValue();
		
		LOG.debug("myValue: "+myValue); // myValue: 100
		
		String num01Str = "100";
		int num01 = Integer.parseInt(num01Str);
		LOG.debug("num01: "+(num01+1)); // num01: 101
		
		Integer i01 = new Integer(100);
		Integer i02 = new Integer(100);
		
		System.out.println("i01 == i02: "+ (i01 == i02)); // false
		System.out.println("i01.equals(i02): "+ (i01.equals(i02))); // true
		// Integer 최소값
		System.out.println(Integer.MIN_VALUE); // -2147483648
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println("SIZE: "+Integer.SIZE+" bit");
		System.out.println("BYTES: "+Integer.BYTES+" BYTES");
	}

}
//2022-02-18 11:24:53,101 DEBUG [main] wrapper.WrapperEx01Main (WrapperEx01Main.java:16)     - myValue: 100
//2022-02-18 11:24:53,102 DEBUG [main] wrapper.WrapperEx01Main (WrapperEx01Main.java:20)     - num01: 101
//i01 == i02: false
//i01.equals(i02): true
//-2147483648
//2147483647
//SIZE: 32 bit
//BYTES: 4 BYTES

