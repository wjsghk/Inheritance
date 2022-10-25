package com.package3;

public class D {
	C c = new C(10);
	void printD() {
		System.out.println(c.c);//  같은 패키지 안이라 사용가능
	}
}
