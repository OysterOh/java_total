package basic.begin;
/**
 230221 화
*/

import java.util.Scanner;

/*
사용자에게 섭씨온도를 입력받아서
화씨온도로 변환하여 출력하는 로직을 작성하세요.
화씨 온도는 소수점 첫째 자리까지 표현한다.
*/
public class CelToFahrJunho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("℃:");
        double cel = sc.nextDouble();


        System.out.printf("%.1f℉\n", (cel*9/5)+ 32);
		
		sc.close();
		
	}

}
