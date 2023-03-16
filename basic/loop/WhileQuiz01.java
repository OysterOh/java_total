package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {
	/**
	 * 230223
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		  #사용자에게 구구단 단수를 입력받아 ->scanner
		  해당 단수의 구구단을 출력하세요
		 */
		System.out.print("구구단을 입력하세요: ");

		int dan = sc.nextInt();
		int hang = 1;

		while(hang <= 9) {
			System.out.printf("%d x %d = %d\n", dan, hang, dan*hang);
			hang++;
		}

		sc.close();


	}

}
