package com.javacho.book;

import com.package2.B;
import com.package3.C;

public class AccuessModifiy {

	public static void main(String[] args) {
		//���������� p258
		//private<default<protected<public
		//public : �����Ű�� ��ο��� ��밡��
		//protected : ������Ű�� �Ǵ� ��ӹ��� ���迡 �ִ� �ٸ� ��Ű������ ��밡��
		//default : ������Ű��  �Ǵ� ,�ƹ��͵� �Ƚ���������
		//private : Ŭ����!!�������� ��밡��
		
		//Ŭ���� : public , default ,
		//����    : public , protected,default,private
		//������ : public , protected,default,private
		//�޼ҵ� : public , protected,default,private
		//�� ������������ ���Ұ�
		
		B b = new B(10);
		//C c = new C(20);//������ ���� ���� CŬ������ public�� ���ؼ�(=cŬ���� �����ڰ� default�̱� ������)

	}

}
