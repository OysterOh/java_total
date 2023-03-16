package basic.array;

import java.util.Arrays;
import java.util.Scanner;
/** 
 * 230224 배열 array
 */
public class ArrayModify {

	public static void main(String[] args) {

		/*
		 자료형[]변수 = new 자료형 [배열크기];  좌항과 우항의 자료형 통일 
		 변수[0] = 데이터 값;
		 변수[1] = 데이터 값;
		 배열의 값은 모르지만
		 향후 값을 저장하기 위한 배열을 생성하고 싶을 경우 주로 사용
		 */
		String[] foods = {"삼겹살","족발","피자","햄버거"};
		System.out.println(Arrays.toString(foods));

		foods[0] = "치킨";
		foods[2] = "탕수육";
		System.out.println(Arrays.toString(foods));

		//배열의 인덱스 탐색
		System.out.println("----------------");

		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식을 입력하세요: ");
		String name = sc.next();
       
//		int count = 0;
//		for(int i=0; i<foods.length; i++) {
//			if(name.equals(foods[i])) {
//				System.out.println("탐색 완료");
//				System.out.println("인덱스: " + i + "번");
//				count++;
//				break;
//			}
//		}
//		
//		if(count == 0)
//			System.out.println("없는 음식");

		
	boolean flag = false;
		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색 완료");
				System.out.println("인덱스: " + i + "번");
				flag = true;
				break;
				}
		}
		
		if(!flag) {
			System.out.println("없는 음식");
		}
		
		int count = 0;
		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색 완료");
				System.out.println("인덱스: " + i + "번");
				break;
			}else if(!name.equals(foods[i])) {
				count++;
				if(count == foods.length) {
					System.out.println("없는 음식");
				}
				
			}
		}
		
		int i;
		for(i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색 완료");
				System.out.println("인덱스: " + i + "번");
				break;
			}
		}if(i == foods.length) {
			System.out.println("없는음식");
		}
		
		sc.close();


	}

}
