package basic.loop;

public class WhileExample1 {
/**
* 230222 반복문1
*/
	public static void main(String[] args) {
        /*
         # while문의 진행순서
         1. 제어변수를 선언. (시작값이 정해진다)
         2. while문의 조건식을 검사해서 true면 반복문이 시작/ false라면 반복문 종료.
         3. while문 블록 내부가 한 번 진행되면(끝까지 내려가면)
            다시 조건식을 검사하여 true라면 반복문 계속 진행, false라면 반복문 종료.
         4. 반복문 내에는 증감식 배치해서 제어변수 값을 조정.                                              
         */
				
		//반복문 필수 3요소 b.e.s.
		int n = 1;  //제어변수: 반복문의 횟수를 제어할 변수. 시작점! (begin)
		
		while(n <= 10) {  //논리형 조건식: 반복문의 끝을 지정. (end)
			System.out.println("안녕하세요. 반갑습니다! " + n);
			n++; //증감식: 반복문의 종료를 위해 제어변수의 값을 조정(step) while문 내에 위치
		}
		
		System.out.println("-----------------------");
		
		//1~10까지의 누적합계
		int i =1;  //begin
		int total = 0;  //누적합을 기억해줄 변수(필수X)
		
		while(i <= 10) {  //end
			total += i;  //복합연산자 +=  total에 i를 계속 더해준다(1~10)
			i++; //step
		}
		
		System.out.println("1~10까지의 누적합: " + total);
		
		
	}

}
