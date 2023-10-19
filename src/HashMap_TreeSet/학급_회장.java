package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class 학급_회장 {
	static void solution(int n, char[] arr) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}

		int max = 0;
		char result = ' ';
		Set<Character> characters = hm.keySet();
		for (Character c : characters) {
			if (hm.get(c) > max) {
				result = c;
				max = hm.get(c);
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		char[] arr = str.toCharArray();
		solution(n, arr);
	}
}
