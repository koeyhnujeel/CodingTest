package Array;

import java.util.Scanner;

public class 가위_바위_보 {
	static void solution(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) System.out.println('D');
			else{
				if(a[i] - b[i] == 1) System.out.println('A');
				if(a[i] - b[i] == 2) System.out.println('B');
				if(a[i] - b[i] == -1) System.out.println('B');
				if(a[i] - b[i] == -2) System.out.println('A');
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		solution(a, b);
	}
}
