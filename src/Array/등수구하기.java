package Array;

import java.util.Scanner;

public class 등수구하기 {
	static void solution(int[] arr) {
		for (int i : arr) {
			int rank = 1;
			for (int j : arr) {
				if (i < j) rank++;
			}
			System.out.print(rank + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		solution(arr);
	}
}
