package Array;

import java.util.Scanner;

public class 뒤집은_소수 {
	static void solution(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int tmp = Integer.parseInt(arr[i]);
			if (tmp == 0 || tmp == 1) continue;

			int cnt = 1;
			for (int j = 1; j <= Math.sqrt(tmp); j++) {
				if (tmp % j == 0) cnt++;
			}
			if(cnt == 2) System.out.print(tmp + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new StringBuilder(sc.next()).reverse().toString();
		}
		solution(arr);
	}
}
