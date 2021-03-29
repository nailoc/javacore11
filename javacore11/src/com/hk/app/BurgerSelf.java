package com.hk.app;

public class BurgerSelf extends FoodSelf{

	private boolean isSet; //true 세트 false 단품
	private String side; //사이드 메뉴
	private String dring; // 음료수
	
	// 생성자를 통해서 설정 가능
	public BurgerSelf() {
		isSet = false;
	}
	public BurgerSelf(boolean set) {
		isSet = set;
	}
	
	//재정의- 세트메뉴로 했을 경우
	public void setPrice(int price) {
		// 가격을 재조정
	}
	
	
}
