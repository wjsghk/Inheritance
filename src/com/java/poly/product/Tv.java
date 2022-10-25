package com.java.poly.product;

public class Tv extends Product {
	Tv(){
		super(100);//부모클래스 호출해야  'class Tv' 밑에 빨간줄 오류가 해결된다.
	}

	@Override
	public String toString() {//source->implemnet methods->toString 클릭 
		
		return "Tv";
	}

}
