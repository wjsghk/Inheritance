package com.java.capsule;
//상속은     extends
//다형성은  오버로딩,오버라이딩, 상속을 활용
//캐슐화(=정보,데이터보호)는  접근제어자(private)

public class Time {
	private int hour;
	private int minute;
	private int secound;
	final double PI;  //상수(생성자를 통한 초기화)
	
	
	public Time(double pI) {
		super();
		PI = pI;
	}
	
	
//----------------------------------------------------------------------------------------------------------------12일차
	//getter/setter  =>source 클릭-> 제너널에이트 getter,setter 클릭 자동완성
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour<0 || hour>23) {
			System.out.println("유효하지 않은 값 입니다.");
			return;
		}
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0 || minute>59) {
			System.out.println("유효하지 않은 값 입니다.");
			return;
		}
		this.minute = minute;
	}
	
	public int getSecound() {
		return secound;
	}
	public void setSecound(int secound) {
		if(secound<0 || secound>59) {
			System.out.println("유효하지 않은 값 입니다.");
			return;
		}
		this.secound = secound;
	}
	
	
	
}
	


	

