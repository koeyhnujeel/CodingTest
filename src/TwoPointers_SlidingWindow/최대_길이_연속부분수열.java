package TwoPointers_SlidingWindow;

import java.util.Scanner;

public class 최대_길이_연속부분수열 {
	static void solution(int n, int k, int[] arr) {
		int max = 0;
		int cnt = 0;
		int lt = 0;
		for (int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) cnt++;
			while (cnt > k) {
				if(arr[lt] == 0) cnt--;
				lt++;
			}
			max = Math.max(max, rt - lt + 1);
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		solution(n, k, arr);
	}
}
