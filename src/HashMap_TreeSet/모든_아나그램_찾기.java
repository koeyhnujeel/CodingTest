package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 모든_아나그램_찾기 {
	static void solution(String s, String t) {
		int result = 0;
		int len = t.length() - 1;
		int lt = 0;
		HashMap<Character, Integer> tMap = new HashMap<>();
		for (char c : t.toCharArray()) {
			tMap.put(c, tMap.getOrDefault(c, 0) + 1);
		}

		HashMap<Character, Integer> sMap = new HashMap<>();
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			sMap.put(c, sMap.getOrDefault(c, 0) + 1);
		}

		for (int rt = len; rt < s.length(); rt++) {
			char c = s.charAt(rt);
			sMap.put(c, sMap.getOrDefault(c, 0) + 1);
			if (sMap.equals(tMap)) result++;
			sMap.put(s.charAt(lt), sMap.get(s.charAt(lt)) - 1);
			if(sMap.get(s.charAt(lt)) == 0) sMap.remove(s.charAt(lt));
			lt++;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		solution(s, t);
	}
}
