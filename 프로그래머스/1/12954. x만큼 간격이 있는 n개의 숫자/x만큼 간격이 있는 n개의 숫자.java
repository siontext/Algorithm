
class Solution {
    public long[] solution(int x, int n) {
        
        long[] answer = new long[n]; //배열의 길이를 n만큼 선언
        
        
        for(int i = 1; i <= n; i++ ){
            answer[i - 1] = (long) x * i; 
            //매개변수가 int기때문에 long로 명시적 형변환 + 배열은 0부터 시작하기 때문에 answer[i - 1] 해줘야함
        }
        
        return answer;
    }
}

//x 배수만큼 커진다 
//n 만큼 반복한다.

//리스트 배열을 하나 만들어 정답을 담아줘야겠다.
//for 문으로 n만큼 반복 하며 x배수 만큼 커지기
//그리고 배열 리스트에 담아주기.