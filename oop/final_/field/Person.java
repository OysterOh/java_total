package oop.final_.field;
/** 
230308 
 */
public class Person {

	//final 변수는 불변의 값을 의미한다.
	//그렇기 때문에 반드시 초기화가 필요하다.
	//초기화는 직접하는 방법과 생성자를 이용하는 방법이 있다.
	
	final String nation = "대한민국";  //반드시 초기화해야 final변수 이용 가능
	final String name ;
	int age;
	
	public Person(String name) {
		this.name = name;
	}
	
	
}
