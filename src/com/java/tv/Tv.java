package com.java.tv;//��Ű�� �����Ѵ�.

import com.java.print.Print;//tv�� print ����� ���Խ�Ű�� ���

//Tv VCR TVCR ���� ���� 
public class Tv {
	
	Print print= new Print(10,20);//tv�� package���� print�� ���Խ�Ű�� �ڵ� 
	                           // prinf Ŭ������ 9��°�� public Print (int x, int y) ������ =>���԰��踦 ��� �� �� �ִ�.
	
	boolean power;
	int channel;
	
	void power() {power = !power;} //power on/off
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	

}
