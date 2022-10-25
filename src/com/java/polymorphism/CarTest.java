package com.java.polymorphism;

public class CarTest {

	public static void main(String[] args) {

      
		//다형성을 적용한 객체생성
		//창조형의 형변화(참조할 수 있는 멤버의 개수가 변한다)
		
		
		//첫번째방식
	   Car car = null;//변수, 선언과 동시에한거
	   FireEngine fe = new FireEngine();//생성
	   FireEngine fe2 = null;  
	   fe.water();//=>water
	   car = fe;    // car = FireEngine(상속구조에 가능하고),창조형의 형변환이라고 한다.
	   //car.water();  =>오류가 난다 
	   car.stop();//=>stop
	   
	   fe2 = (FireEngine)car;   //강제형변환
	   fe2.water();//=>water
	   
//	   ////두번째방식
//	   FireEngine fe = new FireEngine();
//	   Ambulance ab = new Ambulance();
//	   Car car = new Car();
//	   car.doWork(fe);
//	   car.doWork(ab);
	}

}
