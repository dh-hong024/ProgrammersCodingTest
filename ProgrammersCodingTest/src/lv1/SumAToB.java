package lv1;

public class SumAToB {
    public static void main(String[] args) {
        System.out.println("solution = " + solution(3, 3));
    }
    public static long solution(int a, int b){

        long answer = 0;

        answer = a;
        for(int i = 0; i < Math.abs(a-b); i++){
            answer += a < b ?  b-i :  b+i;
        }

        return answer;
    }
}
