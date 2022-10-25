package com.java.polymorphism;
//��������Ʈ �����ϱ�
public class Car {
	String color;
	int door;
	void driver() {
		System.out.println("drive gogo");
	}
	void stop() {
		System.out.println("stop");
	}
	
	//�Ű����� Car Ÿ������ ���� 
	//Car -> car,fireEngine,Ambulance(=�θ�Ÿ���� �ڽ�Ÿ������ ��ȯ�� �����ϴ�?)
	
	void doWork(Car c) {//�Ű������� Ȱ���� ��ü�� ������
		//instanceof
		//��ü�� Ÿ���� Ȯ���Ѵ�.
		if(c /*(=��������)*/ instanceof FireEngine/*(=Ŭ�����̸�(�˰���� Ÿ��))*/) {
		    FireEngine fe =	(FireEngine)c;
		    fe.water();
		}else if(c instanceof Ambulance) {
			Ambulance ab = (Ambulance)c;
			ab.siren();
		}
	
	}
}
