class Solution {
    public int solution(int num) {
        int count = 0;
        Long answer = Long.valueOf(num); //Long 타입으로 변환
        
        
        while(answer != 1) {
            if (answer % 2 ==0){
                answer = answer/2; 
            }else {
                answer = answer*3 + 1; 
            }
            count ++;
                if(count > 500) {
                    count = -1;
                    break;
                }
        }
        return count;
    }
}

//짝수면 2로 나눈다
//홀수면 3을 곱하고 1을 더한다.
//언제까지? 1일 될때까지
// + + 500번 반복해도 1이 되지 않으면 -1을 반환한다.