package com.pcwk.time.ex05.list.vector;
import java.util.Vector;
public class VectorMain {

	public static void main(String[] args) {
		Vector<String> vector01 = new Vector<>();
		
		vector01.add("1");
		vector01.add("2");
		vector01.add("3");
		vector01.add("4");
		vector01.add("5");
		// 11개부터 담을 수 있는 용량 증가(20), 가변 배열
		print(vector01);
	}
	
	public static void print(Vector<String> v) {
		System.out.println("담을 수 있는 용량 : "+ v.capacity());
		System.out.println("element 개수 : "+v.size());
		
		for(String s : v) {
			System.out.println(s);
		}
	}

}
