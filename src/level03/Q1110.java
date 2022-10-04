package level03;

import java.util.Scanner;

public class Q1110 {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		int input = cs.nextInt();
		System.out.println(input);
		int count = 0;

		while (true) {
			if (count < 10) {
				count = count * 10;
				System.out.println("10보다 작음 > " + count);
			}

			count = (count % 10) * 10 + (count / 10);
			System.out.println("input: " + count);

			if (count == input)
				break;

			count++;
		}
		System.out.println(count);
	}
}