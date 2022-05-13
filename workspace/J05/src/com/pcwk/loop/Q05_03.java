package com.pcwk.loop;

public class Q05_03 {

	public static void main(String[] args) {
		// Q3. 구구단의 짝수단만 출력하도록 프로그램을 작성하세요.	
		// for() { // 2-9
		//   for() {// 1-9
		//		
		//   }
		//}
		for(int i=2;i<=9;i++) { // 단
			if(i % 2 != 0) { // 홀수 걸러내기!
				continue;
			}
			for(int j=1;j<=9;j++) { // 곱하는 수
					System.out.println(i + "*"+ j + "=" + (i*j));
			}
			System.out.println();
		}

	}

}
