package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		/**
		 * 230223
		 */
		/*
		int i = 1;
		int total = 0;
		while(i <= 10) {
			total += i;
			i++;
		}
		 */
		int total = 0;

		for(int i =1; i<=10; i++) {  //3요소 한번에 괄호 안에
			total += i;
		}

		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를 가로로 출력(for)


		for(int a =1; a<=200; a++) {
			if(a % 6 == 0 && a % 12 != 0)
				System.out.print(a + " ");
		}


		System.out.println();

		//1~60000까지의 정수 중 177의 배수의 개수를 구한다.

		int count = 0;
		for(int a=1; a<=60000; a++) {
			if(a % 177 == 0) {
				count++;
			}
		}
		
		System.out.println(count + "개");
		
		//입력받은 정수까지의 팩토리얼 값을 구하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요: ");
		int num = sc.nextInt();
	
		int fac = 1;
			for(int i = 1; i <= num; i++) {
				fac *= i;
			}
		
//		for(int i=num; i>=1; i--) {
//			fac *= i;
//		}
		
		System.out.println(fac);

        sc.close();

	}

}
