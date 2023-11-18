package lv1;

public class GetMean {
    /*
        정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
     */
    public static void main(String[] args) {
        int[] number = {1,2,3,4};
        System.out.println(Solution(number));
    }

    public static double Solution(int[] arr){
        double answer = 0;
        for(int number : arr){
            answer += number;
        }
        return answer / arr.length;
    }
}
