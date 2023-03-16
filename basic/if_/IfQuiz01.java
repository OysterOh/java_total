package basic.if_;

import java.util.Scanner;

/**
230221 화 / 조건문 퀴즈 1
*/
public class IfQuiz01 {

	public static void main(String[] args) {

		/*
		 키와 나이를 입력 받아서 사용자가 놀이기구에 탑승할 수 있는지의 여부를 판단
		 키 140cm 이상, 나이 8세 이상 사용자만 탑승 가능하다 가정하고
		 판단할 수 있는 로직 작성.
		 하나의 조건이라도 만족 못하면 탑승 불가.
		 
		 놀이기구 탑승 여부 관계없이 "오늘 하루 즐거운 시간 되세요!"를 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요: ");
		double height = sc.nextDouble();
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.println(height + "cm " + age + "세");
		
		if(height >= 140 && age >= 8) {System.out.println("탑승하실 수 있습니다.");
		}  else {
			System.out.println("탑승조건에 맞지 않아 탑승하실 수 없습니다.");
		}

		 System.out.println("오늘 하루 즐거운 시간 되세요!");
		 sc.close();
	}
}
     
	    
