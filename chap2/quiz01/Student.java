package chap2.quiz01;

public class Student extends Person{
//	String studentId = "a001";
	String studentId;
	
//	public Student(String name, int age) {
//		super(name,age);
//	}
	@Override
	void personInfo() {
		super.personInfo();
		System.out.println(" 학번: " + studentId);
	}

	
//	public void id() {
//		String name = "오정원";
//		int age = 24;
//		String num = "119";
//		System.out.printf("이름: %s, 나이: %d, 학번: %s", 
//				name, age, num);
//	}
	
	
}
