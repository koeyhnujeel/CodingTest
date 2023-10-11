package TwoPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 공통원소_구하기 {
	static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> result = new ArrayList<>();
		int p1 = 0; int p2 = 0;
		while (p1 < n && p2 < m) {
			if (a[p1] == b[p2]) {
				result.add(a[p1]);
				p1++; p2++;
			}
			else if (a[p1] < b[p2]) p1++;
			else p2++;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		int m = sc.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		Arrays.sort(b);

		ArrayList<Integer> result = solution(n, m, a, b);
		for (Integer i : result) {
			System.out.print(i + " ");
		}
	}
}
