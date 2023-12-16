package lv1;

import java.util.Arrays;

public class SortDescString {
    public static void main(String[] args) {
        System.out.println("solution(\"Zbcdefg\") = " + solution("Zbcdefg"));
    }

    public static String solution(String s){

        char[] charArray = s.toCharArray();
        //오름차순 정렬
        Arrays.sort(charArray);

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < charArray.length; i++){
            sb.append(charArray[i]);
        }

        return sb.reverse().toString();
    }
}
