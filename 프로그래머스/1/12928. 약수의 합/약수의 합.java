class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++){
            if(n%i == 0) 
            answer += i;
        } 
        return answer;
    }
}

//반복문으로 나누기 값이 0이면 모아서 더하기?