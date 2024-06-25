class Solution {
    public long solution(long n) {
        long answer = 0;
        
        if(Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long)Math.pow(Math.sqrt(n)+1 , 2);
        } else
            return -1;
        
    }
}

//n이 양의 정수의 제곱이면 n+1의 제곱 리턴
//n이 음수정수의 제곱이면 -1 리턴

//sqrt() 함수는 제곱근을 구할 수 있고 (Math 함수)
//pow() 함수는 제곱을 구할 수 있다.
//양의 정수의 제곱인지 알기 = 