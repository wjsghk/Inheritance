package com.package2;

public class B {
	
	public int b;

	public B(int b) {//source클릭->제너럴 ~유징 필스 클릭 하면 자동완성됨.
		super();//부모클래스 생성 호출을 한거
		this.b = b;
	}
	
	public void printB() {
		System.out.println(b);
	}
	
}
