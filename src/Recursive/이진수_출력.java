package Recursive;

import java.util.Scanner;

public class 이진수_출력 {
	static void dfs(int n) {
		if(n == 0) return;

		dfs(n / 2);
		int tmp = n % 2;
		System.out.print(tmp);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		dfs(n);
	}
}
