package basic.if_;

import java.util.Scanner;
/**
230221 화 / 조건문 퀴즈 2
 */
public class IfQuiz02 {

	public static void main(String[] args) {

		/*
		 -정수 2개 입력받아서, 어느 수가 큰 지 혹은 같은 지를 판별
		  ex/
		  4,7 -> 7이 큰 수 입니다.
		  10,3 -> 10이 큰 수 입니다.
		  5,5 -> 같은 수 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int numa = sc.nextInt();

		System.out.print("숫자를 입력하세요: ");
		int numb = sc.nextInt();

		System.out.println("--------------------------------");

		if (numa > numb) {
			System.out.println(numa + "이(가) 큰 수 입니다.");
		}  else if(numa < numb) {
			System.out.println(numb + "이(가) 큰 수 입니다.");
		}  else {
			System.out.println("같은 수 입니다.");
		}
		//	    마지막은 else{}   else if(X)
		sc.close();

	}

}
