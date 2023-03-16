package oop.encap.good;
/**
* 230306 은닉
*/
public class MainClass {

	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
		
//		my.year = 2000513;
		my.setYear(2000); 
		my.setMonth(11);
		my.setDay(9);
		
		
		System.out.printf("내 생일은 %d년 ", my.getYear("abc1234"));
		System.out.printf("%d월 %d일 입니다.\n", my.getMonth(), my.getDay());
		

	}

}
