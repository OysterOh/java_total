package basic.loop;

public class ForQuiz01 {
/**
* 230223
*/
	public static void main(String[] args) {

		//2~19까지의 난수를 (Math.random) 생성해서 구구단을 출력한다 for
		//19행까지 출력한다.

		int dan = (int) (Math.random()*18+2);  //난수생성
		System.out.println(dan + "단");

		for(int i = 1; i <= 19; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan);
		}
		


	}

}
