package Array;

import java.util.Scanner;

public class 소수_에라토스테네스_체 {
	static int solution(int n) {
		int result = 0;
		int[] arr = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			if(arr[i] == 0) result++;
			for(int j = i; j <= n; j += i) arr[j] = 1;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = solution(n);
		System.out.println(result);
	}
}
