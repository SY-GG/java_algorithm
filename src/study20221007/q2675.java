package study20221007;

import java.util.*;
import java.io.*;

public class q2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer rs = new StringTokenizer(br.readLine(), " ");
			int r = Integer.parseInt(rs.nextToken());
			String s = rs.nextToken();

//			System.out.println(r + " " + s);

			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < r; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
