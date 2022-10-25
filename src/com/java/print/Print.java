package com.java.print;
//object(조부모)-print(부모)-print3d(자식)
public class Print {//print가 부모고 print3d가 자식클래스다.
	public int x;
	public int y;
//	Print(){            
//		super();  //Object클래스의 생성자 호출을 나타낸거다
//	}
	public Print (int x, int y) {//부모생성자!!!,(인스턴스 멤버변수),   ' public ' 적으면서 포함관계가 완성된다.=>tvcrtest 클래스에
		this.x =x;
		this.y =y;
	}
	public String getLocation() {//' public ' 적으면서 포함관계가 완성된다.=>tvcrtest 클래스에
		return "x : " + x + " ,y : " + y;
	}

}
