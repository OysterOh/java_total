package basic.loop;

public class WhileExample2 {
	/**
	 * 230222 반복문2
	 */
	public static void main(String[] args) {

		//48~150사이의 정수 중 8의 배수만 가로로 출력해보세요.
		//48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복한다.

		int a = 48;                   //시작점

		while(a <= 150) {              //범위
			if(a%8 == 0) {
				System.out.print(a + " ");
			}
			a++;
		}



		int n = 48;
		while(n <= 150) {
			System.out.print(n + " ");
			n += 8;          // n++;
		}

		System.out.println();           

		//1~100까지의 정수 중 4의 배수이면서
		//8의 배수는 아닌 수를 가로로 출력

		int b = 1;
		while(b <= 100) {
			if(b % 4 == 0 && b % 8 != 0)
				System.out.print(b + " ");
			b++;
		}

		
		int c = 4;
		while(c <= 100) {
			if(c%4 == 0) {
			  if(a % 8 != 0) {
			   System.out.print(a + "  ");
			   }
		}
		c++;
	}
		 
        System.out.println();
        
        
		//1~30000까지의 정수 중 258의 배수의 개수를 출력.
				
		
		int k = 1;
		int count1 = 0;   //배수의 개수를 기억해줄 변수
		
		while(k <= 30000) {
			if(k % 258 == 0) {
				 count1++;  //count1 += 1; count1 = count1 + 1;
			}
			k++;           //k +=1;  k = k + 1;
		}
		
		System.out.println(count1);
		
		
		
		//1000의 약수의 개수를 구하세요
		//1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요
		//그랬을 때 나누어 떨어지는 애가 약수다.
		
		int x = 1;
		int count2 = 0;
		while(x <= 1000) {
			if(1000 % x == 0) {
				count2++;    //count2 += 1; count1 = count1 + 1;
			}
			x++;             //x +=1;  x = x+1;
		}
		System.out.println(count2);
		System.out.printf("%d개\n" , count2);
	}

}
