package basic.begin;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {

		/*
		 - 스캐너를 사용하여 이름과 나이를 입력받아서
		 
		 이름: XXX
		 나이: XX세
		 출생년도: XXXX년
		 
		 을 출력하세요. (출력 함수는 마음대로 사용해서 출력하시고
		 출생년도는 입력사항이 아닙니다.)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.next();
		System.out.println(name);
				
		System.out.print("나이: ");
		int age = sc.nextInt();
		int year = 2023 - age;
		
		System.out.printf("이름: %s씨\n나이: %d세\n출생년도 %d 년", name, age, year);
//		year를 2023-age로 바꿔도 된다. 단, int year = 2023 - age;를 삭제시키고 값을 도출할 것
		sc.close();
		
	}

}
