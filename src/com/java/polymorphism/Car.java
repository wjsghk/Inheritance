package com.java.polymorphism;
//다형성파트 공부하기
public class Car {
	String color;
	int door;
	void driver() {
		System.out.println("drive gogo");
	}
	void stop() {
		System.out.println("stop");
	}
	
	//매개변수 Car 타입으로 정의 
	//Car -> car,fireEngine,Ambulance(=부모타입이 자식타입으로 변환이 가능하다?)
	
	void doWork(Car c) {//매개변수를 활용한 객체의 다형성
		//instanceof
		//객체의 타입을 확인한다.
		if(c /*(=참조변수)*/ instanceof FireEngine/*(=클래스이름(알고싶은 타입))*/) {
		    FireEngine fe =	(FireEngine)c;
		    fe.water();
		}else if(c instanceof Ambulance) {
			Ambulance ab = (Ambulance)c;
			ab.siren();
		}
	
	}
}
