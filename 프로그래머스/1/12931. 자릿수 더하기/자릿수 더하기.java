import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        
        String str = String.valueOf(n); //valueOf == int를 String으로 변환
        
        for(int i =0; i < str.length(); i++){
            answer += Integer.parseInt(String.valueOf(str.charAt(i))); //parseInt == String을 int로 변환
        }
        
        return answer;
        
        


    }
}
//문자열로 바꾸고 -> 문자로 바꾸고 -> 다시 정수로 바꿔서 더해야하나?