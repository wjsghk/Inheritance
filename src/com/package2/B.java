package com.package2;

public class B {
	
	public int b;

	public B(int b) {//sourceŬ��->���ʷ� ~��¡ �ʽ� Ŭ�� �ϸ� �ڵ��ϼ���.
		super();//�θ�Ŭ���� ���� ȣ���� �Ѱ�
		this.b = b;
	}
	
	public void printB() {
		System.out.println(b);
	}
	
}
