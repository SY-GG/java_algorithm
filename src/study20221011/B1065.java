package study20221011;

import java.io.IOException;
import java.util.Scanner;

public class B1065 {
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
//		hansu(sc.nextInt());
		System.out.println(hansu(sc.nextInt()));

	}

	private static int hansu(int a) {
		int count = 0;
		for (int i = 0; i < a; i++) {
			if (((a / 1000) - (a / 100) == (a / 100) - (a / 10)) && ((a / 100) - (a / 10) == (a / 10) - (a % 10))) {
				System.out.println("한수:" + a);
				count++;
			}
		}

		return count;
	}
}
