package com.java.print;
//object(���θ�)-print(�θ�)-print3d(�ڽ�)
public class Print {//print�� �θ�� print3d�� �ڽ�Ŭ������.
	public int x;
	public int y;
//	Print(){            
//		super();  //ObjectŬ������ ������ ȣ���� ��Ÿ���Ŵ�
//	}
	public Print (int x, int y) {//�θ������!!!,(�ν��Ͻ� �������),   ' public ' �����鼭 ���԰��谡 �ϼ��ȴ�.=>tvcrtest Ŭ������
		this.x =x;
		this.y =y;
	}
	public String getLocation() {//' public ' �����鼭 ���԰��谡 �ϼ��ȴ�.=>tvcrtest Ŭ������
		return "x : " + x + " ,y : " + y;
	}

}
