package oop.string;

import java.util.Scanner;
/** 
230303 
 */
public class StringQuiz02 {

	public static void main(String[] args) {
		/*
		 1. 주민등록번호 13자리를 입력받는다
		 2. 주민등록번호는 -을 포함해서 받을 예정이다
		 3. 13자리가 아니라면 다시 입력받는다
		 4. 남자인지 여자인지를 구분해서 출력하면 된다.
		 */
		Scanner sc = new Scanner(System.in);

		

		outer:while(true) {
			System.out.print("주민등록번호 13자리를 '-'를 포함해 입력해주세요: ");
			System.out.print("> ");
			String jm = sc.nextLine();
			//				String str = jm;
			//				char a = str.charAt(8);
			jm = jm.replace("-", "");
			
			if(jm.length() != 13) {
				System.out.println("13자리로 다시 입력해주세요");
			} else {
				switch(jm.charAt(6)) {
				case '1' : case '3':
				System.out.println("남자");
				break;
				
				case '2' : case '4':
				System.out.println("여자");
				break outer;
				
				default:
					System.out.println("잘못입력했어요");
//				String[] num = jm.split("-");
//				int a = Integer.parseInt(num[1].substring(0, 1));
				
					
					
//				if(a == 2 || a == 4) {
//					System.out.println("여자입니다.");
//				}else if(a == 1 || a == 3) {
//					System.out.println("남자입니다.");
//				}else {
//					System.out.println("뭔가 이상한데요?");
//					break;
//				}

			}
		}
		sc.close();
	}

   }
}