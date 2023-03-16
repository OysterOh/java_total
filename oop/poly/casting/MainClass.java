package oop.poly.casting;
/** 
230307 
*/
public class MainClass {
/*
 * 참조 변수의 타입 변환
자바에서는 참조 변수도 다음과 같은 조건에 따라 타입 변환을 할 수 있습니다.

1. 서로 상속 관계에 있는 클래스 사이에만 타입 변환을 할 수 있습니다.

2. 자식 클래스 타입에서 부모 클래스 타입으로의 타입 변환은 생략할 수 있습니다.

3. 하지만 부모 클래스 타입에서 자식 클래스 타입으로의 타입 변환은 반드시 명시해야 합니다.
 */
	public static void main(String[] args) {

		Parent p = new Parent();
		p.n1 = 1;
//		p.n2 = 2; (x)  자식 고유의 멤버변수 존재조차 모른다
		
		p.method1();
		p.method2();  //parent 클래스에 선언
//		p.method3();    child 클래스에 선언
		
		
		System.out.println("---------------");
	
		
		Child c =new Child();
		c.n1 = 1;  //부모에게 물려받은 속성
		c.n2 = 2;  //자식의 고유 속성
		
		c.method1();
		c.method2();
		c.method3();
		
		System.out.println("---------------");
		
		//다형성 적용(promotion)
		Parent p2 = new Child();  //부모의 시선
		p2.n1 = 1;
//		p2.n2 = 2; (x)
		
		p2.method1();
		p2.method2();
//		p2.method3(); (x)
		
		/*
		 - 다형성이 적용되면 자식 클래스의 본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생
		 - 이를 해결하기 위해 강제 타입 변환을 사용한다. 
		 */
		
		Child c2 = (Child) p2; //부모 타입을 자식 타입으로 강제 변환(Downcasting)
		c2.n2 = 2;             //하고나니 출력 가능
		c2.method3();
		
		System.out.println("p2의 주소값: " + p2);
		System.out.println("c2의 주소값: " + c2);
		
		Object o = new Parent();
//		o.n1 = 1;(x)
//		o.method1(); (x)
		
		//다형성이 한 번도 발생하지 않은 경우에는 강제 형변환을 사용할 수 없다.
		Parent ppp = new Parent();
//		Child c3 = (Child) ppp;  (x)
		//문법 자체는 에러가 없지만 실행시키면 에러 (자식 타입의 부모 객체는 없다)		
		
	}

}
