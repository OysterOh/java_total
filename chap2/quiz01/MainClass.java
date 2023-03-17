package chap2.quiz01;

public class MainClass {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 24;
		s1.studentId = "a18";
		s1.personInfo();
		
		
		Teacher t1 = new Teacher();
		t1.name = "김철수";
		t1.age = 50;
		t1.subject = "수학";
		t1.personInfo();
	
		
		Employee e1 = new Employee();
		e1.name = "박영희";
		e1.age = 50;
		e1.departments = "영업부";
		e1.personInfo();
	
	}
	
}
