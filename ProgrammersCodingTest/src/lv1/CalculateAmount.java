package lv1;

public class CalculateAmount {
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 3));
    }

    public static long solution(int price, int money, int count){
        long answer = 0;
        long sum = 0;
        for(int i = 1; i <= count; i++){
            sum += price * i;
        }
        if(money < sum){
            answer = sum - money;
        }else{
            answer = 0;
        }

        return answer;
    }
}
