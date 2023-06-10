package study20230610;

public class P181950 {
    public static void main(String[] args) {
        String str = "hello";
        int n = 5;
        System.out.println(forSoultion(str, n));;
//        System.out.println(repeatSolution(str, n));;
    }

    public static String forSoultion(String str, int n){
        String result = "";

        for(int i = 0; i < n; i++){
            result = result + str;
        }
        return result;
    }

//    public static String repeatSolution(String str, int n){
//        return str.repeat(n);
//    }
}
