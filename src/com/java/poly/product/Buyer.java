package com.java.poly.product;
//buyer�� product�� ���԰���� �Ѵ�
public class Buyer  {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {//Tv,Computer,Audio
		if(money < p.price) {
		System.out.println("�ݾ��� �����մϴ�.");
		return;
	}


	money -= p.price;
	bonusPoint += p.bonusPoint;
	System.out.println(p +"���ſϷ�");
	}	
	
	
	
}
//	Product p =new Tv()  =>2��
//    Tv t new Tv()   =>2��