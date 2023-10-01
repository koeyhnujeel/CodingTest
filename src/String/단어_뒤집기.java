package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class 단어_뒤집기 {
	static ArrayList<String> solution(String[] arr) {
		ArrayList<String> list = new ArrayList<>();

		for (String s : arr) {
			String tmp = new StringBuilder(s).reverse().toString();
			list.add(tmp);
		}
		return list;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int len = Integer.parseInt(br.readLine());
		String[] arr = new String[len];
		for (int i = 0; i < len; i++) {
			arr[i] = br.readLine();
		}

		ArrayList<String> result = solution(arr);
		for (String s : result) {
			bw.write(s);
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
