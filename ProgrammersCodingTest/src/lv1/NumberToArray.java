package lv1;

import java.util.Arrays;

public class NumberToArray {
    /*
        자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다
     */
    public static void main(String[] args) {
        solution(123456);
    }

    int i = 0;
    public static int[] solution(long number){
        String strNumber = String.valueOf(number);
        int[] answer = new int[strNumber.length()];

        for(int i = 0; i < strNumber.length(); i++){
            answer[i] = Integer.parseInt(strNumber.substring(strNumber.length()-1-i, answer.length-i));
        }
        return answer;
    }

}
