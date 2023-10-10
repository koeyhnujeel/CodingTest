package Array;

import java.util.Scanner;

public class 보이는_학생 {
	static int solution(int[] arr) {
		int cnt = 0;
		int max = 0;

		for (int i : arr) {
			if (i > max) {
				cnt++;
				max = i;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr));
	}
}
