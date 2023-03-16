package basic.loop;

import java.util.Scanner;
/**
 * 230223
 */
public class WhileExample3 {

	public static void main(String[] args) {

		/*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		   인지를 판별한다. 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요: ");
		int a = sc.nextInt();
		
		int yak = 1;      //소수의 판별을 위해 입력받은 정수a를 지속적으로 나눌 변수
		int count = 0;    //나누어 떨어진 횟수를 기억할 변수

		while(yak <= a) {
			if(a % yak == 0) {
				count++;
			}
			yak++;	
		}
		
				
		if(count == 2) {
			System.out.println(a + "은(는) 소수입니다.");
		} else {
			System.out.println(a + "은(는) 소수가 아닙니다.");
		}

		
		System.out.println("-------------------------");
		
		int j = 2;     //1은 모든 수의 약수이기 때문에 배제한다.
		
		while(a % j != 0) {
			j++;
		}
		
		System.out.println(a == j ? "소수입니다" : "소수가 아닙니다.");
			
		sc.close();
		
	}

}

