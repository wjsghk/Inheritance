package com.java.poly.product;
//Product 부모클래스 나머지 서브클래스
public class Product {
	int price;//가격
	int bonusPoint;//멤버십포인트
	
	Product(int price){
		this.price=price;
		bonusPoint = (int)(price /10.0);
	}

}
