package com.java.polymorphism;

public class CarTest {

	public static void main(String[] args) {

      
		//�������� ������ ��ü����
		//â������ ����ȭ(������ �� �ִ� ����� ������ ���Ѵ�)
		
		
		//ù��°���
	   Car car = null;//����, ����� ���ÿ��Ѱ�
	   FireEngine fe = new FireEngine();//����
	   FireEngine fe2 = null;  
	   fe.water();//=>water
	   car = fe;    // car = FireEngine(��ӱ����� �����ϰ�),â������ ����ȯ�̶�� �Ѵ�.
	   //car.water();  =>������ ���� 
	   car.stop();//=>stop
	   
	   fe2 = (FireEngine)car;   //��������ȯ
	   fe2.water();//=>water
	   
//	   ////�ι�°���
//	   FireEngine fe = new FireEngine();
//	   Ambulance ab = new Ambulance();
//	   Car car = new Car();
//	   car.doWork(fe);
//	   car.doWork(ab);
	}

}
