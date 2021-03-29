package com.hk.app;

public class BurgerSelf extends FoodSelf{

	private boolean isSet; //true 세트 false 단품
	private String side; //사이드 메뉴
	private String drink; // 음료수
	
	// 생성자를 통해서 설정 가능
	public BurgerSelf() {
		isSet = false;
	}
	public BurgerSelf(boolean set) {
		isSet = set;
	}
	
	//재정의- 세트메뉴로 했을 경우
	public void setPrice(int price) {
		// 세트 메뉴 체킹
		if(isSet) {
			setSide("포테이토칩");
			setDrink("콜라제로");
		}
		super.setPrice(price);
	}
	
	public boolean isSet() {
		return isSet;
	}
	public void setSet(boolean isSet) {
		this.isSet = isSet;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	
	
	
	
}
