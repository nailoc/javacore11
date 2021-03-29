package com.hk.app;

public class Salary {
	
	private int rate; // 시간당 급여 (클래스 내에서만 접근)
	private int hour; // 시간
	
	public Salary() {
		rate=10000;
	}
	
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
	public boolean setRate(String id, String pw, int rate) { 
	// admin / 8090 이면 시간당 급여를 변경가능
		boolean result=false;
		if(id.equals("admin")) {
			
			if(pw.equals("8090")) {
				this.rate = rate;
				result=true;
			}else {
				System.out.println("비밀번호를 확인바랍니다");
			}
			
		}else {
			System.out.println("아이디를 확인바랍니다");
		}
		
		return result;
	
	}
	
	

}
