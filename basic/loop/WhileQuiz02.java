package basic.loop;

import java.util.Scanner;
/**
 * 230223
 */
public class WhileQuiz02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//입력받은 수의 약수의 총합을 구하세요.
		//12 : 1 2 3 4 6 12  = 28
		System.out.print("숫자를 입력하세요: ");

		int su = sc.nextInt();
		int yak = 1;           //begin
		int total = 0;            //누적합을 담아줄 변수
		while(yak <= su) {
			if(su % yak == 0) {
				total += yak;
			}
			yak++;
		}

		System.out.println(su + "약수의 합: " + total);

	}

}
