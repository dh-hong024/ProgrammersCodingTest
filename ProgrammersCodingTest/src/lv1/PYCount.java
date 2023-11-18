package lv1;

import java.util.Arrays;

public class PYCount {
    public static void main(String[] args) {
        System.out.println(solution("p"));
    }

    public static boolean solution(String s){

        boolean answer = false;
        int pCnt = 0, yCnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                pCnt++;
            }
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                yCnt++;
            }
        }
        if(pCnt == yCnt){
            answer = true;
        }

        return answer;
    }
}
