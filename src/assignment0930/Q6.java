package assignment0930;

public class Q6 {
	public static void main(String[] args) {
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		int count = 1;

		int num = 15;
		while (end_index < num) {
			if (sum < num) {
				end_index += 1;
				sum += end_index;
			} else if (sum == num) {
				count++;
				sum -= start_index;
				start_index++;
			} else {
				// sum >N
				sum -= start_index;
				start_index++;
			}
		}
		System.out.println("end:" + end_index);
		System.out.println("start:" + start_index);
		System.out.println("sum" + sum);
		System.out.println("count" + count);
	}
}
