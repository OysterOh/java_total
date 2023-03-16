package basic.operator;

public class AssignmentOperator {

	public static void main(String[] args) {
		 
		/*
		 * 대입(할당) 연산자 (=)
		 * 복합 대입 연산자 (+=, -=, *=, /= 몫, %= 나머지)
		  -변수에 값을 대입할 때 사용하는 연산자이다.
		  -복합 대입 연산자는 대입 연산자에 산술 연산자가 결합되어 있는 형태이다.
		 */
		
		int a = 5;
		int b = 5;
		
//		b =+ 3; // b = +3;
		a += 3;  //a = a + 3 = 8  (1,4,2,3)
		System.out.println(a);
		
		System.out.println("-------------------------");
		
		a -= 4;  //8에서 4를 뺀 값 =4
		System.out.println(a);
		
		a *= 6;   //4에서 6을 곱한 값 =24
		System.out.println(a);
		
		a /= 5;  //24에서 5를 나눈 값의 몫 =4
		System.out.println(a);
		
		a %= 3;  //4에서 3을 나눈 값의 나머지 =1
		System.out.println(a);
	
	
	}

}
