package oop.constructor;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		/*
		  Scanner를 이용해서 사용자에게 이름, 나이, 키를 입력받아
		  해당 정보를 저장하는 객체를 디자인한다
		  객체 내에는 해당 사람의 정보를 모두 출력해주는 info() 메서드가 존재한다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String pName = sc.next(); 
		
		System.out.print("나이: "); 
		int pAge = sc.nextInt();
		
		System.out.print("키: ");
		int pHeight = sc.nextInt();
		
		Person a = new Person(pName, pAge, pHeight); //p빼고 일괄 처리 가능(name age height)
		a.info();
		
		sc.close();
	}

}
