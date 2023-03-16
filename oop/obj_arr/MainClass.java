package oop.obj_arr;
/**
 * 230307
 */
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
//		Person kim = new Person("김자바", 32, "남자");
//		Person lee = new Person("이정재", 27, "여자");
//		Person oh = new Person("오정원", 24, "남자");
//		
//		kim.personInfo();
//		lee.personInfo();
//		oh.personInfo();
		
//		int [] arr = new int[5];
//		Person[] people = new Person[3];
//		people[0] = new Person("김자바", 32, "남자");
		
//		int [] arr = {1, 2, 3, 4, 5};
		Person[] people = {
				new Person("김자바", 32, "남자"),
				new Person("이정재", 27, "여자"),
				new Person("오정원", 24, "남자")
		};
		
//		System.out.println(Arrays.toString(people)); 주소값 참조
		
//		people[0].personInfo();
//		people[1].personInfo();
//		people[2].personInfo();
		
		for(int i=0; i<people.length; i++) {
			people[i].personInfo();
		}
		
		for(Person p : people) {
			p.personInfo();
		}
	}

}
