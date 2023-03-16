package basic.if_;

import java.util.Scanner;
/**
230221 화 / 조건문 퀴즈 3
*/
public class IfQuiz03 {

	public static void main(String[] args) {

		/*
		 # 스캐너를 사용하여 정수를 하나 입력받는다
		 
		 -입력받은 값이 7의 배수라면 "7의 배수입니다." 를 출력.
		 -입력 받은 값이 7배수 아니라면 "7의 배수가 아닙니다." 출력.
		 -입력받은 값 0이면 "0입니다." 출력.
		 */
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("정수를 하나 입력하세요: ");
	 int num = sc.nextInt();
	 
	 if(num == 0) {
		 System.out.println("0입니다");
	 } else if(num % 7 == 0) {
		 System.out.println(num + "은(는)7의 배수입니다.");
	 } else {
		 System.out.println(num + "은(는) 7의 배수가 아닙니다.");
		 	 }
     //  0 먼저 털기
	 //	 num % 7 == 0    7로 나눈 나머지가 0 'AssignmentOperator' 참조
	 
	 sc.close();
	}

}