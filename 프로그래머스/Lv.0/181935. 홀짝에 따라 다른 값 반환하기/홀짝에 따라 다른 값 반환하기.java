class Solution {
    public int solution(int n) {
        int a = 0;
        
        if(n % 2 != 0) { //홀수면
            for(int i = 1; i <= n; i+=2) { //홀수인것만 반복문
                a += i; //홀수끼리 더하기
            }
        }else { //짝수면
                for(int i = 0; i <=n; i+=2){ //짝수만 반복
                    a += i*i; //제곱해서 더하기
                 
                }
            }
        return a;          
        }

     
    }


//if 절 같은데 홀수면 -> 홀수면 , n 이하의 홀수끼리 더해라 
//if 와 for 문이 함께 들어가야하나?