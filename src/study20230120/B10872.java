package study20230120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(input));
    }

    static int fibonacci(int n){
        if (n <= 1) {
            return 1;
        } else {
            return n * fibonacci(n-1);
        }
    }
}
