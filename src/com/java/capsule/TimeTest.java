package com.java.capsule;

public class TimeTest {

	public static void main(String[] args) {
		Time t=new Time(3.14);//
//		t.hour=48;//시는 0~23시 까지// Time 클래스에 private을 이용해서 오류가난다
		t.setHour(48);
		System.out.println(t.getHour());
		
		//분,초는 0~59

	}

}
