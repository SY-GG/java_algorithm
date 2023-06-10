package study20230610;

public class P181943 {
    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;

        System.out.println(my_string.substring(0, s) + overwrite_string + my_string.substring(s+ overwrite_string.length()));
    }
}
