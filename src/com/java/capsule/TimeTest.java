package com.java.capsule;

public class TimeTest {

	public static void main(String[] args) {
		Time t=new Time(3.14);//
//		t.hour=48;//�ô� 0~23�� ����// Time Ŭ������ private�� �̿��ؼ� ����������
		t.setHour(48);
		System.out.println(t.getHour());
		
		//��,�ʴ� 0~59

	}

}
