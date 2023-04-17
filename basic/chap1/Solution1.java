package basic.chap1;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {

		/*
		 문제: nums 배열에서 가장 큰 값을 출력하는 코드를 작성합니다. 
	     입력: Scanner를 사용해서 입력받은 값을 nums 배열에 삽입합니다.
	     배열의 크기는 10이고, 중복 입력값은 없다고 가정합니다.
	     배열의 모든 인덱스에 값을 채울 때 까지 입력을 반복합니다.
         출력: ex) 가장 큰 값: 95의 형태로 출력합니다.
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇개의 수를 입력하나요: ");
//		int count = sc.nextInt();
//		int []arr = new int[count];
//
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		sc.close();
//		
//		int max = arr[0];
//		for(int i=1; i<arr.length; i++) {
//			if(max<arr[i])
//				max = arr[i];
//		}
//		
//		System.out.println("최댓값: " + max);
		//		arr[i]= sc.nextInt();
		//		for(int i=0; i<arr.length; i++) {
		//			if(arr[i]>max) {
		//				max = nums[i];
		//			}
		//		}

		

		// int[] nums = new int [10];
		// int count;
		//
		// while(true) {
		//
		// }


		// for(int i=0; i<nums.length; i++) {
		// if(nums[i]>max) {
		// max = nums[i];
		// }
		// }

		//		int[] nums = new int [10];
		//		int max = nums[0];
		//		int maxPos = 0;
		//		for(int i=0; i<nums.length; i++) {
		//		if(max<nums[i]) {
		//		max = nums[i];
		//		maxPos = i+1;
		//		}
		//		}

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int [10];
		for(int i=0; i<arr.length; i++) {
			System.out.print("정수 " + (i+1) + ": ");
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최댓값: " + max);
	}

}
