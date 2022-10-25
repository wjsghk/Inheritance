package com.javacho.book;

import com.package2.B;
import com.package3.C;

public class AccuessModifiy {

	public static void main(String[] args) {
		//접근제어자 p258
		//private<default<protected<public
		//public : 모든패키지 경로에서 사용가능
		//protected : 같은패키지 또는 상속받은 관계에 있는 다른 패키지에서 사용가능
		//default : 같은패키지  또는 ,아무것도 안써져있을때
		//private : 클래스!!내에서만 사용가능
		
		//클래스 : public , default ,
		//변수    : public , protected,default,private
		//생성장 : public , protected,default,private
		//메소드 : public , protected,default,private
		//단 지역변수에는 사용불가
		
		B b = new B(10);
		//C c = new C(20);//에러가 나는 이유 C클래스에 public를 안해서(=c클래스 생성자가 default이기 때문에)

	}

}
