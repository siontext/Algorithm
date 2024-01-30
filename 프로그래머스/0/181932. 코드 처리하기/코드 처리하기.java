class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') mode = 1 - mode; // code에 1이 나오면 모드 변경 
             else if (i % 2 == mode) answer += code.charAt(i); 
             //모드가 0, 인덱스가 짝수고 == mode짝수면 => answer변수에 넣어주기
             //모드가 1, 인덱스가 홀수고 == mode홀수면 => answer변수에 넣어주기
            
        }

        return "".equals(answer) ? "EMPTY" : answer;
    }
}
