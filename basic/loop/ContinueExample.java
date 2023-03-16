package basic.loop;
/**
 * 230224 건너뛰기 continue
 */
public class ContinueExample {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) continue;   //짝수만 출력한다    

			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료");

	}

}
