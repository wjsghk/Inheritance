package com.java.poly.product;
//Product �θ�Ŭ���� ������ ����Ŭ����
public class Product {
	int price;//����
	int bonusPoint;//���������Ʈ
	
	Product(int price){
		this.price=price;
		bonusPoint = (int)(price /10.0);
	}

}
