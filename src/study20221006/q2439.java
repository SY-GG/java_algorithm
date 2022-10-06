package study20221006;

import java.util.*;
import java.io.*;

public class q2439 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(j + i < n ? " " : "*");
			}
			System.out.println();
		}
	}
}
