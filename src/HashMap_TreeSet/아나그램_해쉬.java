package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램_해쉬 {
	static String solution(String s1, String s2) {
		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			hm.put(s1.charAt(i), hm.getOrDefault(s1.charAt(i), 0) + 1);
		}

		for (int i = 0; i < s2.length(); i++) {
			hm.put(s2.charAt(i), hm.getOrDefault(s2.charAt(i), 0) - 1);
		}

		for (char c : hm.keySet()) {
			if (hm.get(c) != 0) return "NO";
		}
		return "YES";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String result = solution(s1, s2);
		System.out.println(result);
	}
}
