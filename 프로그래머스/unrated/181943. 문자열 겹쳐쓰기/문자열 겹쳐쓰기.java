class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
    String answer = my_string.substring(0, s) + overwrite_string;
                        //HelloWorl, ProgrammerS123 //d가 없네;;
        
        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }
        
        return answer; 
        
        // He11oWor1d이 더 길면  > helloworl(answer)
        // answer에 answer문자길이(9)만큼을 뺀 나머지 my_string 문자열을 answer에 더함
        
                 
        
        //substring(0, 5): 문자열을 자르거나 추출하는메서드, (시작, 끝직전)까지 추출
        //substring(5): 5자리에서 부터 추출시작
        


    }
}