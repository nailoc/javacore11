package com.hk.app;

public class CarGame {

	public static void main(String[] args) {
		
		Car pcar = null;
		FireCar cfcar1 = new FireCar();
		FireCar cfcar2 = null;
		
		pcar = cfcar1; // 자식참조변수 -> 부모참조변수 대입 가능
		cfcar2 = (FireCar)pcar; // 에러발생 -> 형변환이 필요함
		
		cfcar2.water();

	}

}
