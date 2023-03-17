package chap2.quiz01;

public class Teacher extends Person{
	
	String subject;

	
	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	void personInfo() {
		// TODO Auto-generated method stub
		super.personInfo();
		System.out.println(" 과목: " + subject);
	}
	
}
