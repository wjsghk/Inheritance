package com.package5;

import com.package4.Time;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		//t.hour = 10;     나머지는 다 오류 
		//t.min =10;          // 
		//t.nano = 10;        //
		t.sec = 10;// public라 오류가 안난다
		

	}

}
