package oop.final_.field;
/** 
230308 
 */
public class MainClass {

	public static void main(String[] args) {

		Person kim = new Person("김철수");
//		kim.nation = "미국";  (x)
//		kim.name = "김수철";  (x)
		kim.age = 30;
		
		Person park = new Person("박영희");
//		park.nation = "영국";  (x)
//		park.name = "박영국";  (x)
		
		System.out.println(kim.name);
	}

}
