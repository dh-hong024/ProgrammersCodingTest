package lv1;

public class ConvertStringToInteger {

    /*
        문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
     */
    public static void main(String[] args) {
        Solution("-1234");
    }

    public static int Solution(String s){

        int answer = 0;

        answer = Integer.parseInt(s);
        System.out.println(answer);

        return answer;
    }
}
