package basic.switch_;

import java.util.Scanner;
/**
 * 230222 switch 조건문2
 */
public class SwitchExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();

		switch(point / 10) {

		case 10:
			if(point > 100) {
				System.out.println("잘못된 점수입니다.");
				break;
			}   //100점은 알아서 case 9 A로 떨어진다.
		case 9:
			System.out.println("당신의 학점은 A입니다.");
			break;
		case 8:
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break;
		case 6:
			System.out.println("당신의 학점은 D입니다.");
			break;

		default:              //case를 설정하지 않은 값들은 모두 default로 온다. print값의 차이를 두기 위해 if/else사용
			if(point > 100 || point < 0) {      //점수로 나오지 않을 값들 (100초과의 정수, 음수)
				System.out.println("점수를 잘못 입력하셨습니다.");
			} else {
				System.out.println("당신의 학점은 F입니다.");
			}

		}

		sc.close();
	}

}
