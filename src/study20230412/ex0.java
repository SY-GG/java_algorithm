package study20230412;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class ex0 {
    public static void main(String[] args) {
        String[] arr = new String[2];
        arr[0] = "hei";
        System.out.println(Arrays.toString(arr));

        String[] arr2 = {"hei", "hi"};
        System.out.println(arr2);

        int[] arr3 = new int[3];
        int[] arr4 = {3, 2, 1, 4, 5};
        System.out.println(arr3);
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));


        ArrayList<String> list = new ArrayList<>();
        list.add("hee");
        System.out.println(list);
        list.add(0, "hig");
        System.out.println(list);
    }
}
