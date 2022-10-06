package study20221006;

import java.util.*;
import java.io.*;

public class q10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		System.out.println(N + " " + X);

		st = new StringTokenizer(br.readLine(), " ");
//		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (num < X)
				System.out.print(num + " ");
		}

	}
}
