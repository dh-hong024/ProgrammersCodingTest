package lv1;

public class StringBasic {
    public static void main(String[] args) {
        System.out.println("solution(\"1234\") = " + solution("1234"));
        System.out.println("solution(\"0234\") = " + solution("0234"));
        System.out.println("solution(\"a123\") = " + solution("a123"));
    }

    public static boolean solution(String str){

        if(str.length() == 4 || str.length() == 6){
            return str.matches("^[0-9]*$");
        }

        return false;
    }
}
