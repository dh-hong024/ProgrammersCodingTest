package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKimFromSeoul {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println("solution() = " + solution(seoul));
    }

    public static String solution(String[] seoul){
        List<String> list = Arrays.asList(seoul);
        return  "김서방은 " + list.indexOf("Kim")+ "에 있다";
    }
}
