package basic.loop;

public class BreakExample1 {
	/**
	 * 230224
	 */
	public static void main(String[] args) {

		for(int i=1; i <=10; i++) {
		
			if(i>7) break;
			
			
			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료");
		
		
		System.out.println("-------------------------");
		
		/*
		 - 내부 반복문에 포함된 break로 바깥쪽 반복문까지 한번에 종료시키고 싶다면
		   바깥쪽 반복문에 label을 붙인다.
		   그리고, break 선언 시 label을 함께 선언한다.
		   label은 보통 반복문 앞에 선언하여 반복문을 지칭하게 하여 사용한다.
		   break문에 label을 붙여 반복문을 제어한다. 
		 */
		
		outer: for(int i =0; i<=2; i++) {
			for(int j=0; j<=1; j++) {
				if(i ==j) {           //0-0부터 출력 안되서 0-1도 안된다(outer없을 때)
					break outer;
				}
				System.out.println(i + "-" + j);
			}
		}
			
	}

}
