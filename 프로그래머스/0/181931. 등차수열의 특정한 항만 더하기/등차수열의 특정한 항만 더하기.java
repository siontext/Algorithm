class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        
        for(int i=0; i < included.length; i++) {
            if (included[i]){ //included [i] 번째가 true면
                answer += a + (i * d); //등차수열 구하는 공식?? 
            }
        }
            return answer;
    }
}