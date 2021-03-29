package com.hk.app;

public class Exam2 {

	public static void main(String[] args) {
		
		BurgerSelf bKing = new BurgerSelf(true);
		BurgerSelf bKing2 = new BurgerSelf();
		
		// bKing 세트메뉴로 구입을 했더니
		// 가격이 7000원이고 사이드메뉴 포테이토, 드링크 오렌지쥬스
		bKing.setName("햄버거세트");
		bKing.setSet(true);
		bKing.setPrice(7000);
		System.out.println("주문메뉴:"+ bKing.getName());
		System.out.println("추가메뉴:"+ bKing.getDrink() + "," + bKing.getSide() );
		System.out.println("결제금액:"+ bKing.getPrice());
		
		// bKing 단품으로 구입을 했더니
		// 가격이 6000원이고 사이드메뉴, 드링크 없음(공백)
		bKing2.setName("햄버거단품");
		bKing2.setSet(false);
		bKing2.setPrice(6000);
		System.out.println("주문메뉴:"+ bKing2.getName());
		System.out.println("추가메뉴:"+ bKing2.getDrink() + "," + bKing2.getSide() );
		System.out.println("결제금액:"+ bKing2.getPrice());

	}

}
