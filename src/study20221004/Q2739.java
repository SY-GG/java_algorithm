package study20221004;

import java.util.*;

public class Q2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gugu = sc.nextInt();
		sc.close();
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%d * %d = %d\n", gugu, j, gugu * j);
		}
	}
}
