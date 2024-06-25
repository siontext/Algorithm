import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = Long.toString(n); // 문자열로 변환
        String[] strArr = str.split("");//문자열을 괄호 기준으로 나누기

        Arrays.sort(strArr, Collections.reverseOrder()); //sort 정렬, 컬렉션의 리버스 메서드 사용
        str = String.join("", strArr); //strArr배열뒤에 ""를 붙혀하나의 문자열로 생성
        
        answer = Long.parseLong(str);// Long타입으로 변환

        return answer;      
        
        
    }
}

//정렬문제 -> sort
//하나씩 for문으로 리스트로 만들고 -> 정렬???
//