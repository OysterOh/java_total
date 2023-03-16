package basic.if_;

import java.util.Scanner;
/**
230221 화 / 조건문 퀴즈 4
 */
public class IfQuiz04 {

	public static void main(String[] args) {


		/*
		 - 정수 3개를 입력받습니다.
		 - 가장 큰 값, 가장 작은 값, 중간 값을 구해서 출력한다.

		 # max, mid, min이라는 변수를 미리 선언
		  판별 될 때마다 각각 변수에 값을 넣어준다.
		  마지막에 한번에 출력한다.
		 */

		Scanner sc = new Scanner(System.in);
		//		int num1 = sc.nextInt();
		//		int num2 = sc.nextInt();
		//		int num3 = sc.nextInt();

		System.out.print("정수를 하나 입력하세요: ");
		int num1 = sc.nextInt();

		System.out.print("정수를 하나 입력하세요: ");
		int num2 = sc.nextInt();

		System.out.print("정수를 하나 입력하세요: ");
		int num3 = sc.nextInt();

		int max;
		int mid;
		int min;

		if (num1 > num2 && num1 > num3) {
			if(num2 > num3) {
				max = num1;
				mid = num2;
				min = num3;
			} else {               //num3 > num2
				max = num1;
				mid = num3;
				min = num2;
			}                   	
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {    
				max = num2;
				mid = num1;
				min = num3;					
			} else {                //num3 > num1
				max = num2;
				mid = num3;
				min = num1;
			}

		} else {                    //num3 이 가장 클 때
			if (num1 > num2) {
				max = num3;
				mid = num1;
				min = num2;
			} else {                  //num2 > num1
				max = num3;
				mid = num2;
				min = num1;
			}
		}

		System.out.println("max: " + max); 
		System.out.println("mid: " + mid); 
		System.out.println("min: " + min); 


	}

}



