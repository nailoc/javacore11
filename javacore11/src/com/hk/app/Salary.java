package com.hk.app;

public class Salary {
	
	private int rate; // 시간당 급여 (클래스 내에서만 접근)
	private int hour; // 시간
	
	// 게터와 세터  source 메뉴에서 생성
	public int getRate() {
		return rate;
	}
	private void setRate(int rate) {
		this.rate = rate;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	// 오버로딩
	public void setRate(String id, String pw, int rate) { 
	// admin / 8090 이면 시간당 급여를 변경가능
	
	}
	
	

}
