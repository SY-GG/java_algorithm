package study20221006;

import java.util.*;
import java.io.*;

public class q10952 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while (true) {
//			System.out.println(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
//			System.out.println(a + " " + b);
			if (a == 0 && b == 0) {
				break;
			}

			System.out.printf("%d\n", a + b);
		}
	}
}
