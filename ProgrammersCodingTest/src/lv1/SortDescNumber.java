package lv1;

import java.util.Arrays;

public class SortDescNumber {
    /*
        함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
     */
    public static void main(String[] args) {
        solution(23890470);
    }
    public static long solution(long n){
        long answer;

        String[] strNumber = String.valueOf(n).split("");
        Arrays.sort(strNumber);
        StringBuffer sb = new StringBuffer();
        for(String number : strNumber){
            sb.append(number);
        }
        answer = Long.parseLong(String.valueOf(sb.reverse()));
        System.out.println("answer = " + answer);

        return answer;
    }
}
