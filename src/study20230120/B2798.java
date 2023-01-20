package study20230120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[] array = (br.readLine().split(" "));
//
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = Integer.parseInt(br.readLine().split(" ")[i]);
//        }

        Arrays.sort(array);
        Arrays.toString(array);

        int answer = 0;

        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = i + 2; k < array.length; k++) {
                    int result = Integer.parseInt(array[i]) +
                            Integer.parseInt(array[j]) +
                            Integer.parseInt(array[k]);
                    if (result > m) break;
                    else answer = (result > answer ? result : answer);
                }
            }
        }
        System.out.println(answer);
    }
}
