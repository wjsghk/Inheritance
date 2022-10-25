package com.java.print;

public class Print3D extends Print {
	int z;//3D라 좌표 하나 더 만든거 2D는 x,y이 2개 이용함
	
	//상속에서의 생성자의 특징
	//1. 부모생성자를 호출해야한다.!!!!
	//2. 호출시에 super()를 사용한다.
	//3. 기본생성자인 경우 부모생성자의 기본 생성자를 호출한다
	//4. 생성자는 상속되지 않는다.(멤버변수와 메소드만 상속되어진다.)
	Print3D(){            //Print가 부모 슈퍼클래스,   Print3d가 서브클래스
	    super(10,20); //Print(int x,int y){}부모생성자 호출 
	    this.z = 30;
}
//	Print3D(int x, int y,int z) {  //이해안감 패스
//		super(x,y);//Print(int x, int y)
//		this.x = 100;
//		this.y = 200;
//		this.z = 30;
//	}
	
	public String getLocation() {//오버라이딩(재정의)에 예시
		return  super.getLocation() + ", z : " + z;//(="x : " + x + ", y : " + y + ", z : " + z;)와 같은 내용이다.
	}//호출때문에 리턴이 나온다, 슈퍼(부모)클래스를 불러온다!!!
}
    //상속구조에 사용한다.
	//(Print 클래스 참조=)부모메소드의 선언부와 동일해야된다.(리턴타입포함해서 동일해야된다.) 선언부= String getLocation(){리턴문,매개변수}
	//매개변수도 동일해야된다.
	//단 실행문은 재정의 한다. 재정의 =다시정의한다
	//부모의 메소드를 사용할 때는 super라는 키워드 사용한다.