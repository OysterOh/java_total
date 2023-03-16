package oop.obj_arr;

import java.util.Scanner;

/**
 * 230307
 */
public class ArrayInsert {

	public static void main(String[] args) {
		/*
        - 스캐너를 이용하여 Person객체를 생성하는 데 필요한
         정보를 입력받으시면 되겠습니다.
         입력받은 정보를 토대로 Person객체를 생성한 후
         여러 개의 Person 객체를 배열에다 담아 둘 생각입니다.

        - 배열의 크기는 3개로 하겠습니다. 반복문을 이용하여
         입력을 반복해서 받아주시면 됩니다.

        - 입력이 끝나면 배열 안에 있는 모든 주소값을 순회하여
         각 객체의 personInfo()를 호출해 보세요. 
        */
		Scanner sc = new Scanner(System.in);
		
		Person[]arr = new Person[3];
		
		for(int i=0; i<arr.length ; i++) {
			System.out.print("이름: " );
			String name = sc.next();
			System.out.print("나이: " );
			int age = sc.nextInt();
			System.out.print("성별: " );
			String gender = sc.next();
//			System.out.printf("이름: %s,나이: %d 성별: %s" 
//					,name, age,  gender);

//			p.setName(name);
//			p.setAge(age);
//			p.setGender(gender);
			
			/*
			Person p = new Person(name, age, gender);
			arr[i] = p;
			*/
        
			arr[i]= new Person(name, age, gender); 
			// 메소드의 인수로 배열을 선언하면서 초기화해야 할 경우
			
			System.out.println("**정보 입력 완료**\n"); //Person객체에 입력 완료
			
		}  //입력받는 반복문 끝
		
		for(Person p : arr) {
			p.personInfo();
		}
		
		sc.close();

	}

}
