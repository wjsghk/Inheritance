package com.java.print;

public class Print3DTest {

	public static void main(String[] args) {
		Print3D p3 =new Print3D(); //Print3D()->Print()->Object()  생성순서와 호출?은 순서가 반대다
		
		p3.x = 10;
		p3.y = 20;
		p3.z = 30;
		
		String point = p3.getLocation();
		System.out.println(point);
		

	}

}
