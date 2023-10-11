package Array;

import java.util.Scanner;

public class 멘토링 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		solution(n, m, arr);
	}

	static void solution(int n, int m, int[][] arr) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int cnt = 0;
				for (int k = 0; k < m; k++) {
					int mentor = 0;
					int mentee = 0;
					for (int s = 0; s < n; s++) {
						if (arr[k][s] == i) mentor = s;
						if (arr[k][s] == j) mentee = s;
					}
					if(mentor < mentee) cnt++;
				}
				if(cnt == m) result++;
			}
		}
		System.out.println(result);
	}
}
