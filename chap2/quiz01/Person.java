package chap2.quiz01;

public class Person {

	String name;
	int age;
	String departments;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}
	
	void personInfo() {
		System.out.printf("이름: %s, 나이: %d ," , 
				name, age);
	}
//	void teacherInfo() {
//		System.out.printf("이름: %s, 나이: %d, 과목: %s", 
//				name, age, departments);
//	}
//	
//	void employeeInfo() {
//		System.out.printf("이름: %s, 나이: %d, 부서: %s", 
//			name, age, departments);
//	}
}
