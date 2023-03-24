package chap04;

import java.util.List;
import java.util.Scanner;

//프로그램의 기능들을 메서드화 시킨 클래스.
public class Point {

	private Scanner sc = new Scanner(System.in);
	private String stuId;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	private String grade;

	// 점수 입력창 틀 메서드.
	public void showPointUI() {
		System.out.println("================================================================");
		System.out.printf("%4s%6s%7s%8s%8s%8s%8s%8s\n"
				, "학번", "이름", "국어", "영어", "수학", "총점", "평균", "학점");
		System.out.println("================================================================");
	}


	//to 경민쌤
	//저는 이런저런 실수가 많아서 과제 사이사이에 뜬금없는 주석들이 많습니다. 
	//왜 이런걸 쓸까 싶으셔도 너그러이 이해해주시길 부탁드릴게요.

	//프로그램 메뉴 정보를 보여줄 메서드
	public int menuInfo() {
		System.out.println("\n*** 성적 관리 프로그램 ***");
		System.out.println("# 1. 성적 정보 입력");
		System.out.println("# 2. 전체 성적 조회");
		System.out.println("# 3. 개별 성적 조회");
		System.out.println("# 4. 성적 정보 수정");
		System.out.println("# 5. 성적 정보 삭제");
		System.out.println("# 6. 프로그램 종료");
		System.out.println("------------------------");
		System.out.print("# 메뉴를 입력하세요: ");
		int menu = sc.nextInt();
		return menu;
	}

	//1. 학생의 성적 정보를 입력할 메서드
	public void inputPoints(List<Student> sList) {
		//		this.stuId = stuId;
		//		this.name = name;
		//		this.kor = kor;
		//		this.eng = eng;
		//		this.math = math;
		//		this.total= total;
		//		this.average = average;
		//		this.grade = grade;

		Student student = new Student();
		sList.add(student);
		System.out.println(student.getName() + "님의 성적 정보가 정상적으로 입력되었습니다.");
		/*
		 1. 학생 객체를 1개 생성합니다.
		 2. 학생 객체에 속성값을 설정하는 메서드들을 호출해야 합니다.
		 3. 정보 저장이 완료된 객체를 리스트(sList)에 추가해야 합니다.
		 4. 저장 완료 메세지를 호출하세요.
		 ex) XXX님의 성적 정보가 정상적으로 입력되었습니다.
		 */

	}

	//2. 전체 학생들의 성적 정보를 출력할 메서드
	public void showAllPoints(List<Student> aList) { //학생 객체들이 들어있는 리스트가 와야죠?
		showPointUI();
		for(int i=0;i<aList.size();i++){
			System.out.printf("%4s %6s %6d점 %5d점 %7d점 %7d점 %7.2f점 %6s\n"
					, aList.get(i).getStuId(), aList.get(i).getName(), aList.get(i).getKor(), aList.get(i).getEng(), 
					aList.get(i).getMath(), aList.get(i).getTotal(), aList.get(i).getAverage(), aList.get(i).getGrade());	
			//System.out.print("\n\n반 평균: " + aList.get(i).getTotal()/i);
		}		//aList.get(i) => Student (주소).get/getinfo~~~ 

		/*
		 1. 리스트 안에 들어있는 학생 객체들의 정보를
		  반복문을 이용하여 하나씩 전체 출력해야 합니다.
		  한 명의 학생 정보를 출력하는 메서드는 이미 작성 했습니다. (Student 클래스 -> outputStuInfo)

		 2. 학생 점수를 출력할 때 showPointUI를 먼저 출력하고
		  학생들의 점수를 밑에 반복 출력해 주세요.

		 3. 우리 반 평균을 가장 아랫부분에 출력해야 합니다.
		 */

		double totalAvg = 0.0;
		for(Student stu : aList) {
			stu.outputStuInfo();
			totalAvg += stu.getAverage();
		}

		System.out.println("반평균: " + totalAvg/aList.size());
	}

	//3. 개별 성적 조회 로직을 처리할 메서드

	public void searchPoint(List<Student> students) {
		System.out.println("성적을 조회할 학생의 학번을 입력하세요.");
		System.out.print("> ");
		String stuId = sc.next();

		//		for(Student student: students) {
		//			if(student.getStuId().equals(students)) {
		//				System.out.printf("%4s %6s %6d점 %5d점 %7d점 %7d점 %7.2f점 %6s\n"
		//						, ((Student) students).getStuId(), ((Student) students).getName(), ((Student) students).getKor(), ((Student) students).getEng(), 
		//						((Student) students).getMath(), ((Student) students).getTotal(), ((Student) students).getAverage(), ((Student) students).getGrade());
		//			} else {
		//				System.out.println("찾는 학번이 존재하지 않아서 검색하지 못했습니다");
		//			}
		//		}

		/////////////////////////////////////////////////
		int i = 0;
		for(i=0; i<students.size(); i++) {
			if(stuId.equals(students.get(i).getStuId()))
				break;
			else {
				System.out.println("찾는 학번이 존재하지 않아서 검색하지 못했습니다");
			}
		}

		/*
		 1. 입력받은 학번과 일치하는 학생 객체를 리스트에서 찾아내어
		  그 학생의 성적 정보만 출력합니다.
		 2. 찾는 학번이 존재하지 않는다면 검색하지 못했다는
		  메세지를 출력해 주세요.
		 */

		//boolean flag = false;
		//		
		//		for(Student stu : students) {
		//			if(stuNum.equals(stu.getStuId())) {
		//				System.out.printf("%s님의 성적 정보를 출력합니다.\n"
		//						, stu.getName());
		//				showPointUI();
		//				stu.outputStuInfo();
		//				flag = true;
		//				break;
		//			}
		//		}
		//		
		//		if(!flag) {
		//			System.out.println("입력한 학번과 일치하는 학생 정보가 없습니다.");
		//		}
		//		


	}

	//4. 학생의 개인 성적 정보를 수정하는 메서드
	public void modifyPoint(List<Student> students) {
		System.out.print("학번을 입력하세요: ");
		String stuId = sc.next();

		int i = 0;
		for(i=0; i<students.size(); i++) {
			if(stuId.equals(students.get(i).getStuId())) {
				System.out.println(students.get(i).getName() + "의 정보 수정");
				break;}
			else {
				System.out.println("찾는 학번이 존재하지 않아서 검색하지 못했습니다");
			}
		}

		//해당 학번과 일치하는 학생 객체를 리스트에서 찾기

		//		if(!students.contains(stuId)) {
		//			System.out.println("찾는 학번이 없어서 검색하지 못했습니다.");
		//		}
		while(true) {
		try {
			System.out.println("점수를 다시 입력해주세요.");
			System.out.print("국어: ");
			this.kor = sc.nextInt();
			System.out.print("영어: ");
			this.eng = sc.nextInt();
			System.out.print("수학: ");
			this.math = sc.nextInt();
			System.out.println("=====================================================================");
			
			for(int a=0;a<students.size();a++){
				System.out.printf("%4s %6s %6d점 %5d점 %7d점 %7d점 %7.2f점 %6s\n"
						, students.get(i).getStuId(), students.get(i).getName(), students.get(i).getKor(), students.get(i).getEng(), 
						students.get(i).getMath(), students.get(i).getTotal(), students.get(i).getAverage(), students.get(i).getGrade());
				System.out.println("=====================================================================");
				break;
			} }catch (Exception e) {
				System.out.println("잘못된 입력값입니다.");	
				sc.nextLine();
			}
		}
		/*
		 - 학번을 먼저 입력받으세요.
		 - 해당 학번과 일치하는 학생 객체를 리스트에서 찾아내어
		  그 학생의 국어, 영어, 수학점수를 새롭게 입력받아
		  수정을 진행합니다.
		  점수를 수정했다면 그 학생의 총점, 평균, 학점도 
		  새롭게 계산해 주셔야 합니다.

		 - 찾는 학번이 없을 시 검색하지 못했다는 메세지를 출력해 주세요.  try catch 
		 */


	}

	//5. 학생 정보를 삭제하는 메서드
	public void deletePoint(List<Student> students) {

		System.out.print("삭제할 학생의 학번을 입력하세요: ");
		String stuId = sc.next();
		////해당 학번과 일치하는 학생 객체를 리스트에서 찾기////
		//		if(!students.contains(stuId)) {
		//			System.out.println(stuId + "님의 정보가 없습니다.");
		//			return;
		//		}

		System.out.print(stuId + "님의 정보를 삭제합니다.[Y/N]");
		String answer = sc.next();

		if(answer.equals("Y")) {
			students.remove(stuId);
			System.out.println(stuId + "삭제");
			int i = 0;
			for(i=0; i<students.size(); i++) {
				if(stuId.equals(students.get(i).getStuId()))
					break;
				else {
					System.out.println("찾는 학번이 존재하지 않아서 검색하지 못했습니다");
				} return;
			}
			students.remove(i);
		} else if(answer.equals("N")) {
			System.out.println("삭제를 취소합니다.");
			return;
		} else {
			System.out.println("값을 잘못 입력하셨습니다.");
		}return;
		




		/*
		 - 학번을 입력받아서, 해당 학번과 일치하는 학생 객체를
		  리스트에서 찾아내어 그 학생의 모든 정보를 삭제해야 합니다.
		  (리스트에서 해당 객체의 주소값 없애기)
		  학생 정보를 삭제할 때 "XXX님의 정보를 삭제합니다.[Y / N]"
		  를 출력하셔서 한 번 더 삭제 여부를 확인해 주세요.

		 - 학생이 없다면 없다고도 출력해 주세요.
		 */

	}


	public void close() {
		sc.close();
	}

}