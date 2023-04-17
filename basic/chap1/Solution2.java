package basic.chap1;

public class Solution2 {

	public static void main(String[] args) {

		/* 2번
		nums 배열에 저장된 요소의 개수만큼 ★을 출력하는 프로그램을 구현합니다.
		int[] nums = {4, 2, 6, 1, 3};
		★★★★
		★★
		★★★★★★
		★
		★★★

		의 형태로 출력합니다.
		 */
		// int[]arr;
		// arr = new int [6];
		//
		// for(int idx=0; idx<arr.length; idx++) {
		// System.out.println("★" * (idx+1));
		// }
		int[] nums = {4,2,6,1,3};

		for(int i = 0; i < nums.length; i++) {
			for(int j=0; j<nums[i]; j++)
				System.out.print("★");
			    System.out.println();
		}
		
		for(int n : nums) {
			for(int i=1; i<=n; i++) {
				System.out.print("★");
			}
			System.out.println();
		}

	}

}

