package com.java.capsule;
//�����     extends
//��������  �����ε�,�������̵�, ����� Ȱ��
//ĳ��ȭ(=����,�����ͺ�ȣ)��  ����������(private)

public class Time {
	private int hour;
	private int minute;
	private int secound;
	final double PI;  //���(�����ڸ� ���� �ʱ�ȭ)
	
	
	public Time(double pI) {
		super();
		PI = pI;
	}
	
	
//----------------------------------------------------------------------------------------------------------------12����
	//getter/setter  =>source Ŭ��-> ���ʳο���Ʈ getter,setter Ŭ�� �ڵ��ϼ�
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour<0 || hour>23) {
			System.out.println("��ȿ���� ���� �� �Դϴ�.");
			return;
		}
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0 || minute>59) {
			System.out.println("��ȿ���� ���� �� �Դϴ�.");
			return;
		}
		this.minute = minute;
	}
	
	public int getSecound() {
		return secound;
	}
	public void setSecound(int secound) {
		if(secound<0 || secound>59) {
			System.out.println("��ȿ���� ���� �� �Դϴ�.");
			return;
		}
		this.secound = secound;
	}
	
	
	
}
	


	

