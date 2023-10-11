package TwoPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class 두_배열_합치기 {
	static ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
		ArrayList<Integer> list = new ArrayList<>();
		int p1 = 0;
		int p2 = 0;

		while (p1 < n && p2 < m) {
			if (arr1[p1] < arr2[p2]) list.add(arr1[p1++]);
			else list.add(arr2[p2++]);
		}

		while(p1 < n) list.add(arr1[p1++]);
		while(p2 < m) list.add(arr2[p2++]);

		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}

		ArrayList<Integer> result = solution(n, m, arr1, arr2);
		for (Integer integer : result) {
			System.out.print(integer + " ");
		}
	}
}
