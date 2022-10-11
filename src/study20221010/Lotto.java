package study20221010;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] lottoChoice = new int[6];
		int[] lotto655 = { 7, 37, 38, 39, 40, 44 };
		int lottobonus = 18;
		int count = 0; // 맞은 개수
		boolean bonus = false; // 보너스 맞았나틀렸나

		int caseNum = sc.nextInt();

		int prize = 0; // 상금

		for (int k = 0; k < caseNum; k++) {

			// 로또 긁기
			for (int i = 0; i < 6; i++) {
				lottoChoice[i] = sc.nextInt();
			}

//			System.out.println(Arrays.toString(lottoChoice));
//			System.out.println(Arrays.toString(lotto655));

			// 맞은 개수 세기
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (lotto655[i] == lottoChoice[j]) {
						count++;
					}
					if (lottobonus == lottoChoice[j]) {
						bonus = true;
					}
				}
			}

			switch (count) {
			case 3:
				// 5등
				prize += 5000;
				break;
			case 4:
				// 4등
				prize += 50000;
				break;
			case 5:
				if (bonus) {
					prize += 6078_4377;// 2등
				} else {
					prize += 154_7926;// 3등
				}
				break;
			case 6:
				prize += 16_6143_9625; // 1emd
				break;
			default:
				break;
			}
//			System.out.println(count + " / " + bonus + ">" + prize);

			count = 0;
			bonus = false;
		}
		System.out.println(prize);
	}
}
