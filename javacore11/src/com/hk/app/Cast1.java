package com.hk.app;

public class Cast1 {
	
	public static void main(String[] args) {
		
		// 기본타입을 형변환을 예제
		int a = 10; //정수
		double b = 5.3; //실수
		double c = 0.1; //실수
		b = a; // 문제가 없음
		a = (int)b; // 오류발생 -> 오류아니만 -> 데이터 소실
		
		System.out.println(b);
		System.out.println(a);
	}

}
