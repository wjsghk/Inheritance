package com.java.poly.product;

public class SmartPhone extends Product {
	SmartPhone(){
		super(150);//�θ�Ŭ���� ȣ���ؾ�  'class Tv' �ؿ� ������ ������ �ذ�ȴ�.
	}
	@Override
	public String toString() {//source->implemnet methods->toString Ŭ�� 
		
		return "SmartPhone";
	}
}
