package basic.if_;

import java.util.Scanner;
/**
230221 화 / 조건문 퀴즈 5
 */
public class IfQuiz05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		  # 국어, 영어, 수학 점수를 각각 입력받아서
		   평균을 구해 보세요. (평균은 소수점 첫째 자리까지 출력)
		   평균이 90점 넘는다면 다시 한 번 조건을 검사
		   95~100 ->A+
		   94~90 ->A0
		   80점대는 B, 70점대는 C, 60점대는 D, 나머지는 모두 F처리 (100점 만점)

		    ex/
		    평균 점수: 95.5
		    당신의 학점은 A+ 입니다.
		 */

		System.out.print("국어: ");
		double kor = sc.nextDouble();
		System.out.print("영어: ");
		double eng = sc.nextDouble();
		System.out.print("수학: ");
		double mat = sc.nextDouble();

		double avg = (kor + eng + mat)/3.0;

		System.out.printf("평균 점수:  %.1f\n", avg );    
		//%.xf 는 ""안에, %f에 들어갈 avg(,)
		String grade;              //변수 선언

		if(avg >= 90) {
			if(avg >= 95) {
				grade= "A+";
			} else {
				grade= "A0";
			}
		} else if(avg >= 80) {
			grade= "B";
		} else if(avg >= 70) {
			grade= "C";
		} else if(avg >= 60) {
			grade= "D";
		} else {
			grade= "F";
		}

		System.out.println("당신의 학점은 " + grade + "입니다.");

		sc.close();
	}

}
