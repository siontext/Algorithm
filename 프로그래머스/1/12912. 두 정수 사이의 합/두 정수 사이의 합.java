class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(b >= a) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
        }
            
    }
        return answer;

    }
}


//a=3, b=5
//3~5 사이의 수를 모두 더해라
//for 문으로 시작을 a , 끝을 b까지 하고 다 더하면 되는거 아닌가?