package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {
	/**
	 * 230224
	 */
	public static void main(String[] args) {

		/*
		 1. 2가지 정수를 1~100사이 난수를 발생시켜서 지속적으로 문제를 출제한 후
		    정답을 입력받으시오
		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.   
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("***연산퀴즈***");
		while(true) {
			int rn1 = (int) (Math.random()*100 +1);
			int rn2 = (int) (Math.random()*100 +1);

			int i = (int) (Math.random()*2);
			

			int r = rn1 + rn2;
			int k = rn1 - rn2;
			int count = 0;
			int countw = 0;
			int a = sc.nextInt();
			String oper;

			if(i == 1) {
				count = rn1 + rn2;
				oper = "+";
			}else {
				count = rn1 - rn2;
				oper = "-";
			}


			System.out.println("종료를 원하시면 0을 입력하세요 종료됩니다");
			System.out.println(rn1 + oper + rn2 + "=  ???");
			System.out.println("> " + a);
		}

/*
		if(a == r) {
			System.out.println("정답입니다!");
			count++;
		}else if (a == k) {
			System.out.println("정답입니다!");
			count++;
		}else if(a != r && a!=k) {
			System.out.println("오답입니다.");
			countw++;
		}else (a == 0) {
			System.out.println("종료합니다");
			System.out.println("--------------");
			System.out.println("정답 횟수: " + count + "회");
			System.out.println("오답 횟수: " + countw + "회");
			break;
		}

*/

	}

}
