package com.java.tv;

public class TVCRTest {

	public static void main(String[] args) {
		TVCR tvcr = new TVCR();
		String print = tvcr.print.getLocation();
		System.out.println(print);  //public Print (int x, int y) {//인스턴스 멤버변수,   ' public ' 적으면서 포함관계가 완성된다.=>tvcrtest 클래스에

	}

}
