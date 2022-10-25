package com.java.poly.product;
//Product 부모클래스 나머지(Audio,컴퓨터,tv,스마트폰) 서브클래스
public class Audio extends Product {
	Audio(){
		super(150);
	}
	@Override
	public String toString() {//source->implemnet methods->toString 클릭 
		
		return "Audio";
	}
}
