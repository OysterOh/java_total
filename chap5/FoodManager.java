package chap5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FoodManager {

	public static void main(String[] args) {

		Map<String, Integer> foods = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("*** 음식점 메뉴판 관리 프로그램 ***");

		while(true) {

			System.out.println("# 1. 메뉴 등록");
			System.out.println("# 2. 메뉴 전체보기");
			System.out.println("# 3. 프로그램 종료");
			System.out.print("> ");
			int menu = sc.nextInt();


			System.out.println("--------------------------------");

			if(menu == 1) {

				System.out.print("메뉴: ");
				String newMenu = sc.next();
				System.out.print("가격: ");
				int newPrice = sc.nextInt();
				foods.put(newMenu, newPrice);
				//list / set에는 add
				System.out.println(newMenu + " 메뉴가 등록되었습니다.");

				/*
				 - 메뉴명과 가격을 입력받아서 Map에 삽입하시면 됩니다.
				  이미 존재하는 메뉴명이 들어왔다면 '이미 존재하는 메뉴입니다.'
				  를 출력하시고 메인 메뉴로 돌아와 주세요.
				 - 메뉴 등록 완료 후 'XXX 메뉴가 등록되었습니다.' 를 출력하세요.
				 */

			} else if(menu == 2) {  //메뉴 전체보기
				if(foods.size()==0) {
			  //if(foods.isEmpty())
					System.out.println("메뉴부터 먼저 등록해 주세요!");
//					break;
				} 
				else  {
					Set<String> food = foods.keySet();
					//foods(newMenu, newPrice)
					//Map에서 key들만 추출하는 메서드: keySet()
					//모든 key들을 Set에 담아서 반환합니다.
					for(String s: food) {
    			  //for(String s: foods.keySet())
						System.out.println("메뉴: " + s + " 가격: " + foods.get(s));
					}
				}
				/*
				 - 만약 메뉴가 하나도 등록되어 있지 않다면
				  '메뉴부터 먼저 등록해 주세요!' 출력 후 메인 메뉴로 이동시켜
				  주세요. 

				 - Map의 모든 요소를 반복문을 이용하여 출력해 주세요.
				 //Map에서 key들만 추출하는 메서드: keySet()
		         //모든 key들을 Set에 담아서 반환합니다.
				 ex)
				    메뉴명 : 가격
				    메뉴명 : 가격
				    메뉴명 : 가격....*/


				System.out.println("번호를 입력하세요.");
				System.out.println("# 1. 수정");
				System.out.println("# 2. 삭제");
				System.out.println("# 3. 취소");
				System.out.print("> ");
				int menu2 = sc.nextInt();
				switch(menu2) {
				case 1: 
					if(foods.size()==0) {
						System.out.println("메뉴 먼저 등록해주세요");
						
					} 

					Set<String> food = foods.keySet();
					//Map에서 key들만 추출하는 메서드: keySet()
					//모든 key들을 Set에 담아서 반환합니다.
					for(String s: food) {
						System.out.println(s + foods.get(s));
					}

					String name;
					System.out.println("수정할 메뉴를 입력하세요: ");
					name = sc.next();
					//메뉴수정
					if(foods.containsKey(name)) {
						//<key, value>
						System.out.print("가격: ");
						int newPrice = sc.nextInt();

						foods.put(name, newPrice);
						System.out.println(name + "가 저장되었습니다.");
					} else {
						System.out.println("존재하지 않는 메뉴입니다.");
					}
					break;

				case 2: 
					
					//메뉴삭제
					System.out.print("삭제할 메뉴를 입력하세요: ");
					String dName = sc.next();
					if(foods.containsKey(dName)) {
						foods.remove(dName);
						System.out.println(dName + " 메뉴가 삭제되었습니다.");						
					}
					else {
						System.out.println("존재하지 않는 메뉴입니다.");  
					} break;
				case 3: {
					System.out.println("취소합니디.");
				} break;
				default :
					System.out.println("메인 메뉴로 돌아갑니다.");
				}
				/*메뉴를 모두 출력 후에 선택지를 제공하세요.
				  (1. 수정 | 2. 삭제 | 3. 취소)
				  - 수정: 수정할 메뉴명을 입력받아서 가격 수정을 진행하세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.

				  - 삭제: 삭제할 메뉴명을 입력받아서 해당 메뉴를 삭제해 주세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.

				  - 취소: 메인 메뉴로 이동
				 */


			} else if(menu == 3) {
				System.out.print("프로그램 종료하시겠습니까? [Y/N]: ");
				String answer = sc.next();
				if(answer.toUpperCase().equals("Y")) {
			  //if(answer.toLowerCase().equals("y"))
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					//break;
			      System.exit(0);
				} else if (answer.equals("N")) {
					//					return;
				} else {
					System.out.println("메뉴를 잘못 입력하셨습니다.");
				}
				/*
				  - Y / N를 입력받아서 Y가 입력되면 프로그램 종료.
				   그 이외의 값은 종료 취소를 진행해 주세요.
				 */
			}
			else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}

		}

	}

}
