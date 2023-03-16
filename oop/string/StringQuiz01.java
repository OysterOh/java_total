package oop.string;
/** 
230303 
 */
import java.util.Arrays;
import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {

		/*
		 1. 스캐너를 통해 id를 입력받는다.
		 2. 말썽꾸러기 사용자는 id에 공백을 입력할 확률이 굉장히 높다.
		 3. 공백을 제거한 id가 5글자 미만이라면 다시 입력받으시오.
		 4. 5글자 이상 입력되었다면 "id가 등록되었습니다." 출력 후 종료		   	
		 */
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			System.out.print("id를 입력하세요: ");
//			String id = sc.next();
			String id = sc.nextLine().trim();
      		id = id.trim();
			id = id.replace(" ","");   //공백 지우기 "띄어쓰기" -> ""
			if(id.length() < 5) {
				System.out.println("5글자 이상으로 다시 입력하세요");
			}else {
				System.out.println( id + " id가 등록되었습니다.");
				break;
			}
		}
		sc.close();
	}

}
