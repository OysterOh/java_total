package oop.modi.member.pac1;
/**
 * 230306
 */
public class A {

	public int x;
	int y; //default;
	private int z;
	
	
	//생성자 변수와 메서드 사이에
	public A() {
		
		x = 1;
		y = 2;
		z = 3;
				
		this.method1();
		method2();
		method3();

	}
	
	
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	
	
	
}
