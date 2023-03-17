package chap2.quiz01;

public class Employee extends Person{
	//String departments = "영업부";
	String departments;

	@Override
	void personInfo() {
		// TODO Auto-generated method stub
		super.personInfo();
		System.out.println(" 부서: " + departments);
	}
	
}
