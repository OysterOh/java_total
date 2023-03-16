package basic.if_;

import java.util.Scanner;
/**
230221 화 / 조건문 2
*/
public class IfExample2 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
		 
			System.out.print("나이를 입력하세요: ");
			int age = sc.nextInt();
			
			if(age >= 20) {
				System.out.println("성인입니다.");
			} else if(age >= 17) {
				System.out.println("고등학생입니다.");
			} else if(age >= 14) {
				System.out.println("중학생입니다.");
			} else if(age >= 8)  {
				System.out.println("초등학생입니다.");
			} else {                 //if, else if, else if, ... else로 끝낸다
				System.out.println("미취학 아동입니다.");
			}
			
			System.out.println("당신은 사람입니다.");
		    sc.close();
//		순차적인 과정의 조건설정. 거르고 거르고 거르고 걸러지는..
		
		
	}

}
