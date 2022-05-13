package com.pcwk.loop;

public class Q05_04 {

	public static void main(String[] args) {
//		Q4. 구구단 중 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요.
		
		for(int i = 2; i <= 9; i++) { // 단
			for(int j = 1; j <= 9; j++) { // 곱하는 수
				if(i<j) {
					break; // 반복문을 벗어난다.
				}
				System.out.println(i+"*"+j+"="+(i*j));
				// 비효율적이다.
				// if(i>=j) {
				//		System.out.println(i+"*"+j+"="+(i*j));			    
				//  }
			}
			System.out.println();
		}

	}

}
