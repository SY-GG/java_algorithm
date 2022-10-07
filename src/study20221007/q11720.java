package study20221007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
public class q11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "");

		String array = br.readLine();
		int sum = 0;
		for (int i = 0; i < array.length(); i++) {
			int result = array.charAt(i) - '0';
			sum += result;
		}
		System.out.println(sum);
	}
}
