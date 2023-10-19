package HashMap_TreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째_큰_수 {
	static void solution(int n, int k, int[] arr) {
		TreeSet<Integer> h = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int p = j + 1; p < n; p++) {
					h.add(arr[i] + arr[j] + arr[p]);
				}
			}
		}
		if(h.size() < k) System.out.println(-1);
		else {
			int cnt = 0;
			for (Integer i : h) {
				cnt++;
				if (cnt == k) System.out.println(i);
			}
		}
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
