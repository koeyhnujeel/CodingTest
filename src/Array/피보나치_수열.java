package Array;

import java.util.Scanner;

public class 피보나치_수열 {
	static void solution(int[] arr) {
		for (int i = 2; i < arr.length; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;
		solution(arr);

		for (int i : arr) {
			System.out.print(i +" ");
		}
	}
}
