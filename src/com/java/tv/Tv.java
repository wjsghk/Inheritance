package com.java.tv;//패키지 설정한다.

import com.java.print.Print;//tv에 print 기능을 포함시키는 방법

//Tv VCR TVCR 같이 공부 
public class Tv {
	
	Print print= new Print(10,20);//tv를 package에서 print를 포함시키는 코드 
	                           // prinf 클래스의 9번째줄 public Print (int x, int y) 만들어야 =>포함관계를 사용 할 수 있다.
	
	boolean power;
	int channel;
	
	void power() {power = !power;} //power on/off
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	

}
