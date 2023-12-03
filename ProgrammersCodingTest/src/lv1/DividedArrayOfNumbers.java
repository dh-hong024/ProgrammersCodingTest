package lv1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DividedArrayOfNumbers {
    /*
        array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
        divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

        arr은 자연수를 담은 배열입니다.
        정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
        divisor는 자연수입니다.
        array는 길이 1 이상인 배열입니다.

     */
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 13;
        System.out.println("solution([5,9,7,10], 5)\\ = " + solution(arr, divisor));
    }
    public static int[] solution(int[] arr, int divisor){
        int[] answer = Arrays.stream(arr).filter(number -> number % divisor == 0).sorted().toArray();
        if(answer.length == 0){
            answer = new int[] {-1};
        }
        return answer;
    }
}
