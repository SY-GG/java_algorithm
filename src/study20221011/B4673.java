package study20221011;

// 셀프 넘버
//양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수
class selfNumber {
	int selfNumber(int n) {
		int selfNum = n + (n / 10) + (n % 10);
		System.out.println(selfNum);
		return selfNum;
	}
}

public class B4673 {
	public static void main(String[] args) {
		selfNumber d = new selfNumber();
		System.out.println(d.selfNumber(33));
	}
}
