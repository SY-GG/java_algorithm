package study20230610;

public class P181949 {
    public static void main(String[] args) {
        String str = "aBcDeFg";
        String result = "";
        for(int i = 0; i < str.length(); i++){
//            System.out.println(str.charAt(i));

            char now = str.charAt(i);
            if(Character.isUpperCase(now)){
                result = result + Character.toLowerCase(now);
            }else {
                result = result + Character.toUpperCase(now);
            }
        }
        System.out.println(result);
    }
}
