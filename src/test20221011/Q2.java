package test20221011;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int Xline = -1;
		int Xcol = -1;
		int count = 0;

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			String[][] board = new String[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					String input = sc.next();
					board[i][j] = input;
//				// System.out.print(board[i][j] + " ");
//				// System.out.println(i + " " + j);
					if (input.equals("X")) {
						Xline = i;
						Xcol = j;
					}
				}
//			// System.out.println();
			}
//		// System.out.println(Xline + " , " + Xcol);

			int nowLine = Xline;
			int nowCol = Xcol;
			boolean end = true;

			// x축 오른쪽
			while (nowLine < N && nowCol < N && end) {
//			// System.out.print(board[nowLine][nowCol] + " ");
				if (board[nowLine][nowCol].equals("Y")) { // 포
					end = false;
				} else if (board[nowLine][nowCol].equals("H")) {
					if (board[nowLine][nowCol + 1].equals("H")) {
						count++;
						end = false;
					}
					nowCol++;
				} else { // L 빈칸
					nowCol++;
				}
			}
//		// System.out.println("count: " + count);
			nowLine = Xline;
			nowCol = Xcol;
			end = true;

			// x축 왼쪽
			while (nowLine >= 0 && nowCol >= 0 && end) {
				// System.out.print(board[nowLine][nowCol] + " ");
				if (board[nowLine][nowCol].equals("Y")) { // 포
					end = false;
				} else if (board[nowLine][nowCol].equals("H")) {
					if (board[nowLine][nowCol - 1].equals("H")) {
						count++;
						end = false;
					}
					nowCol--;
				} else { // L 빈칸
					nowCol--;
				}
			}
			// System.out.println("count: " + count);
			nowLine = Xline;
			nowCol = Xcol;
			end = true;

			// y축 아래쪽
			while (nowLine < N && nowCol < N && end) {
				// System.out.print(board[nowLine][nowCol] + " ");
				if (board[nowLine][nowCol].equals("Y")) { // 포
					end = false;
				} else if (board[nowLine][nowCol].equals("H")) {
					if (board[nowLine + 1][nowCol].equals("H")) {
						count++;
						end = false;
					}
					nowLine++;
				} else { // L 빈칸
					nowLine++;
				}
			}
			// System.out.println("count: " + count);
			nowLine = Xline;
			nowCol = Xcol;
			end = true;

			// y축 위쪽
			while (nowLine >= 0 && nowCol >= 0 && end) {
				// System.out.print(board[nowLine][nowCol] + " ");
				if (board[nowLine][nowCol].equals("Y")) { // 포
					end = false;
				} else if (board[nowLine][nowCol].equals("H")) {
					if (board[nowLine - 1][nowCol].equals("H")) {
						count++;
						end = false;
					}
					nowLine--;
				} else { // L 빈칸
					nowLine--;
				}
			}
			// System.out.println("count: " + count);
			nowLine = Xline;
			nowCol = Xcol;
			end = true;

			System.out.printf("#%d %d\n", test_case, count);
			Xline = -1;
			Xcol = -1;
			count = 0;
		}
	}
}
