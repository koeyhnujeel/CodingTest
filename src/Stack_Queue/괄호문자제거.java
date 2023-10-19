package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {
	static void solution(String str) {
		Stack<Character> s = new Stack<>();
		for (char c : str.toCharArray()) {
			s.push(c);
			if (c == ')') {
				while (s.pop() != '(');
			}
		}
		for (Character c : s) {
			System.out.print(c);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String str = sc.nextLine();
		solution(str);
	}
}
