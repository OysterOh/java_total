package basic.if_;

import java.util.Scanner;

/**
230221 화 / 조건문 1
 */
public class IfExample1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		System.out.println("내 점수: " + point + "점");
		System.out.println("-----------------");

		if(point >= 70) {
			System.out.println("70점 이상입니다.");
			System.out.println("합격하셨습니다!");		
		} else {
			System.out.println("70점 미만입니다.");
			System.out.println("불합격입니다.");         
		}

		System.out.println("시험 치르느라 수고하셨습니다.");

		//		조건식이 참이라면 {}적용 
		//		if(point < 70)->else가 있으려면 if 필수
		//		else에는 조건문 불가

		sc.close();					

	}
}
