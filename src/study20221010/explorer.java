package study20221010;

import java.util.*;

public class explorer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Cx = sc.nextInt();
		int Cy = sc.nextInt();
		int Sx = sc.nextInt();
		int Sy = sc.nextInt();
		int R = sc.nextInt();

		double result = Math.abs(Math.pow(Sx - Cx, 2) - Math.pow(Sy - Cx, 2));
//		System.out.println(result);

		int isSuccess = (result < Math.pow(R, 2)) ? 1 : 0;
		System.out.print(isSuccess);
	}
}
