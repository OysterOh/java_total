package basic.switch_;

import java.util.Scanner;
/**
 * 230222 switch 조건문
 */
public class SwitchQuiz {

	public static void main(String[] args) {
		/*
  -정수를 하나 입력받고, 연산자를 하나 입력받는다.
   다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
   연산 결과를 출력한다.
   연산자 잘못 입력되면 똑바로 입력하라고 결과를 입력한다.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 1: ");
		int num1 = sc.nextInt();

		System.out.print("연산자를 입력하세요 [+,-,*,/]: ");
		String oper = sc.next();

		System.out.print("정수 2: ");
		int num2 = sc.nextInt();

		int result = 0;
		boolean flag = true;
		
		switch(oper){
		case "+" :
			System.out.println("두 수의 덧셈 결과: " + (num1 + num2));
			break;
		case "-" :
			System.out.println("두 수의 뺄셈 결과: " + (num1 - num2));
			break;
		case "*" :  
			System.out.printf("두 수의 곱셈 결과: " + (num1 * num2));
			//System.out.printf("%d x %d = %d\n", num1, num1, num1*num2);
			break;        
		case "/" :
			if(num2 == 0) {
				System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
				System.out.println("연산할 수 없는 입력값입니다.");
				//System.out.printf("두 수의 나눗셈 결과: "+ "=" + (num1 / num2));
				//System.out.printf("%d / %d = %d\n", num1, num1, num1/num2);
				flag = false;
				break;
				}

		default:
			System.out.println("사칙연산 기호를 정확하게 입력하세요.");
			System.out.println("[+,-,*,/]");
			flag = false;
			
			if(!flag) {
				System.out.printf("%d %s %d = %d\n", num1, oper, num2, result);			
			}
			//		if(oper != "+" || oper != "-" || oper != "*" || oper != "/") {
			//			System.out.println("연산자를 다시 입력하세요.");
			//		} else{
			//			System.out.println("다시 입력하세요");
			//			}
			//		
	sc.close();
		}
	}
}


		



		

	
