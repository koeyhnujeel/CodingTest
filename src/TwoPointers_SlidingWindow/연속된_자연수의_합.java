package TwoPointers_SlidingWindow;

import java.util.Scanner;

public class 연속된_자연수의_합 {
	static void solution(int n, int m, int[] arr) {
		int cnt = 0;
		int sum = 0;
		int lt = 0;
		for (int rt = 0; rt < m; rt++) {
			sum += arr[rt];
			if(sum == n) cnt++;
			while (sum >= n) {
				sum -= arr[lt++];
				if(sum == n) cnt++;
				}
			}
		System.out.println(cnt);
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n / 2 + 1;
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = i + 1;
		}
		solution(n, m, arr);
	}
}
