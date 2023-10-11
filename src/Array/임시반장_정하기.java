package Array;

import java.util.Scanner;

public class 임시반장_정하기 {
	static void solution(int n, int[][] arr) {
		int max = Integer.MIN_VALUE;
		int result = 0;
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if (cnt > max) {
				result = i;
				max = cnt;
			}
		}
		System.out.println(result + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][5];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		solution(n, arr);
	}
}
