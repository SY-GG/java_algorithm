package study20221007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
//주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
public class q11654 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int a = Integer.parseInt(br.readLine());
		Scanner sc = new Scanner(System.in);
		int a = sc.next().charAt(0);
		System.out.println(a);
	}
}
