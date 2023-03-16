package basic.casting;

public class CastingExample3 {

	public static void main(String[] args) {

		char c = 'B';
		int i = 2;

		//서로 타입이 다른 기본 데이터의 연산 시에는 데이터 타입이 큰 쪽에
		//작은 쪽이 맞춰져서 자동으로 형 변환이 진행된 뒤에 연산이 진행된다.

		int intResult = c + i;
		char charResult = (char) (c + i);
		System.out.println(intResult); //66+2
		System.out.println(charResult); //B+2=D

		int k = 10;
		double d = k / 4;
		System.out.println(d);
		//int / int 이기 때문에 소수점 아래 생략(0.5)

		/*		
		double d = (double) k / 4;
		System.out.println(d);


		double d = k / 4.0;
		System.out.println(d);

		2.5도출 가능
		 */	

		//int보다 작은 크기의 데이터 연산은 자동으로 값이
		//int로 변환되어 처리된다. (데이터 손실의 방지)
		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1 + b2);
		//170이 127(byte의 최고값)보다 크지만 JVM이 알아서 int로 변환



	}

}
