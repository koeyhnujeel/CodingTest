package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class 올바른_괄호 {
	static String solution(String str) {
		Stack<Character> s = new Stack<>();
		for (char c : str.toCharArray()) {
			if(s.isEmpty() && c == ')') return "NO";
			else if (c == '(') s.push(c);
			else s.pop();
		}
		if (s.isEmpty()) return "YES";
		else return "NO";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result = solution(str);
		System.out.println(result);
	}
}
