package lv1;

import java.util.ArrayList;
import java.util.List;

public class SpacingOfNumber {
    /*
        함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
        다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
     */
    public static void main(String[] args) {
        System.out.println("solution(2,5) = " + solution(2,5));
    }
    public static List<Long> solution(int x, int n){

        List<Long> list = new ArrayList<>();

        for(long i = 1; i <= n; i++){
            list.add(x * i);
        }

        return list;
    }
}
