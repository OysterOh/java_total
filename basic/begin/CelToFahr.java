package basic.begin;
/**
 230221 화
 */
import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {

		/*
		 사용자에게 섭씨온도를 입력받아서
		 화씨온도로 변환하여 출력하는 로직을 작성하세요.
		 화씨 온도는 소수점 첫째 자리까지 표현한다.
		 # ㄹ 한자 7 -> (℃), ㄹ한자다음장 ->(℉)
		 */
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("℃온도: ");
	    int celcius= sc.nextInt();
//	    온도 실수 ->double | int에 곱해지는 수에 소수점 추가(9.0)하면 도출값 소수점 표현
		double fahr = celcius *9.0/5 +32;
				
		System.out.print("섭씨온도: " + celcius + "℃, ");
		System.out.printf("화씨온도: "+ "%.1f℉ 입니다.", fahr);
		 
		sc.close();
		
		
	}

}
