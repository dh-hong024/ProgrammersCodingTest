package lv1;

public class FindRemainingValueOne {

    /*
        자연수 n이 매개변수로 주어집니다.
        n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요
     */

    public static void main(String[] args) {
        Solution(12);
    }

    public static int Solution(int n){
        int x = 2;
        while(!(n % x == 1)){
            x++;
        }

        System.out.println("결과 확인 : " + x);
        return x;
    }
}
