package Recursive;

import java.util.Scanner;

public class 팩토리얼 {
	static int dfs(int n) {
		if (n == 1) return 1;
		return  n * dfs(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = dfs(n);
		System.out.println(result);
	}
}
