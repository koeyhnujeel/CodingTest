package Array;

import java.util.Scanner;

public class 큰_수_출력하기 {
	static void solution(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(i == 0) System.out.print(arr[i] + " ");
			else if (arr[i]  > arr[i - 1]) System.out.print(arr[i] + " ");
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
