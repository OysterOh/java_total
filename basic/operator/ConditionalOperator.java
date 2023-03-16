package basic.operator;
/**
 * 230222 삼항연산자, 난수
 */
public class ConditionalOperator {

	public static void main(String[] args) {

		/*
        # 3항 연산자
        - 피연산자(연산을 당하는 값)가 3개인 연산자를 말한다.
        - (조건식 ? 좌항 : 우항);
        - 조건식을 비교하여 true일 경우에는 좌항이, false일 경우 우항의 값 도출.
		 */
		
		int x = 10, y = 20;
		
		String result = (x > y ? "x는 y보다 큽니다." : "x는 y보다 작습니다.");
		System.out.println(result);
		
		//난수를 발생시키는 메서드 Math.random();
		//0.0이상 1.0미만의 실수 난수값을 반환한다.
//		double rn = Math.random();
//		System.out.println(rn);
        //1~10까지의 정수 난수를 발생시키고 싶어요        (미만값을 먼저 생각)
		int rn = (int) ((Math.random()*10) + 1); 
		System.out.println(rn);
		
		//10~100까지 정수 난수를 발생
		int rn2 = (int) ((Math.random()*91) + 10);
		System.out.println(rn2);
		
		//34~176까지의 정수 난수
		int rn3 = (int) ((Math.random()*143) +34);   //176+1-34=143
		System.out.println(rn3);
	}

}
