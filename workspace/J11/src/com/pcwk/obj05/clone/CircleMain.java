package com.pcwk.obj05.clone;

public class CircleMain {

	public static void main(String[] args) {
		Circle c01 = new Circle(new Point(1, 1), 2.0);
		
		// 깊은 copy
		Circle c03Deep = c01.deepCopy();
		System.out.println(c03Deep);

		// 얕은 copy : 사용 금지
		Circle c02 = c01.clone();
		c02.p.x = 9;
		c02.p.y = 9;
		
		System.out.println("=========================");
		System.out.println(c01);
		System.out.println(c02);
//		r=2.0, p:x=9, y=9
//		r=2.0, p:x=9, y=9
		
	}

}
