package com.package5;

import com.package4.Time;

public class TimeChild extends Time{
	void printAll() {
		//System.out.println(hour);   오류남  
		System.out.println(min);     //오류x <=프로택트고 같은 패키지안이라
		System.out.println(sec);    //오류x  <= 퍼블릭 
		//System.out.println(nano);    오류남
		
	}

}
