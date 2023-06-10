package study20230610;

public class P181944 {
    public static void main(String[] args) {
        int odd = 101;
        int even = 100;

        isEven(odd);
        isEven(even);
    }

    public static void isEven(int num){
        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.printf("%d is %s", num, result);
    }
}
