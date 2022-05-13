/**
 * 패키지 : com.pcwk.ed03
 * 파일 : EX04Operator.java
 * 작성자 : ITSC
 */
package com.pcwk.ed03;

/**
 * @author ITSC
 *
 */
public class EX04Operator {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("a<b: "+ (a<b)); // a<b: true
		System.out.println("a>b: "+ (a>b)); // a>b: false
		System.out.println(a+b<=c); // true
		System.out.println(a+b>=c); // true
	}

}
