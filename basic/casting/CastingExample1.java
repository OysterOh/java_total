package basic.casting;

public class CastingExample1 {

	public static void main(String[] args) {
	
		
		/*
		 * 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
		 * 자바 가상 머신(JVM)이 자동으로 타입을 올려서 변환해준다.
		 * (promotion, UpCasting)
		 */
		
		byte b = 10;
		int i = b;
		System.out.println(i);
//		자동 타입 변환은 크기가 작은 타입에서 큰 타입 방향 으로 변환된다. (UpCasting)
//		byte < int    byte -> int
		
		char c = 'A';
		int j = c;
		System.out.println("A의 문자 번호: " + j);
//		A는 65번
		
		int k = 500;
		double d = k;
		System.out.println(d);
		
		
		

	}

}
