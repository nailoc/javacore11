package com.hk.app;

public class Exam1 {

	public static void main(String[] args) {
		
		// kim 씨의 시간당 급여를 변경
		Salary kimS = new Salary();
		// 시간당급여를 변경하기 전에  10시간을 일했다면 급여 출력
		// 10000원
		kimS.setHour(10);
		System.out.println("kimS 시간당급여는:"+kimS.getRate());
		System.out.println("kimS 일한시간:"+kimS.getHour());
		System.out.println("kimS 총급여는:"+(kimS.getHour()*kimS.getRate()));
		
		System.out.println();
		// 시간당급여를 변경하기 후에  10시간을 일했다면 급여 출력
		// 15000원으로 변경하고서 (변경시 아이디 패스워드가 맞아야 함)
		kimS.setHour(10);
		
		if(kimS.setRate("admin","8090", 15000)) {
			System.out.println("kimS 시간당급여는:"+kimS.getRate());
			System.out.println("kimS 일한시간:"+kimS.getHour());
			System.out.println("kimS 총급여는:"+(kimS.getHour()*kimS.getRate()));
		}

	}

}
