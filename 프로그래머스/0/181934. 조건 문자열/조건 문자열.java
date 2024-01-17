class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if(ineq.equals(">") && eq.equals("=")) {
            answer = n >= m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("=")){
            answer = n <= m ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("!")){
            answer = n > m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("!")){
            answer = n < m ? 1 : 0;
        }
    
            return answer;
    }
}
//오늘의 핵심 포인트: ==두개의 주소값을 비교, .equals()는 값 자체를 비교한다!
//궁금점: ineq가 "<"일수도 ">" 일수도 있는거 아님?? 어떻게 조건이 맞는지 비교를 하라는거지??
//기호를 썼을때 주어지는 정수와 맞으면 1을 반환하라는 뜻인거 같음 (예상)