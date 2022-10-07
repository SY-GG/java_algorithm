package study20221007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String array = br.readLine();

		int[] aArray = new int["abcdefghijklmnopqrstuvwxyz".length()];
		Arrays.fill(aArray, -1);

		for (int i = 0; i < array.length(); i++) {
			int letterIdx = array.charAt(i) - 'a';
			if (aArray[letterIdx] == -1) {
				aArray[letterIdx] = i;
			}
		}
//		System.out.println(Arrays.toString(aArray));
		for (int letter : aArray) {
			System.out.print(letter + " ");
		}
	}
}
