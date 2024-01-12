class Solution {
    public int solution(int a, int b) {
        
        String ab = String.valueOf(a) + String.valueOf(b); //문자 291
        
        int abValueOf = Integer.valueOf(ab); //정수 291
        
        int c = 2 * a * b;
        
        if(abValueOf > c) {
            return abValueOf;
        } else {
            return c;
        }
        
    }
}

//정수 붙혀쓰기 있으니 => 문자열로 바꾸고 붙혀주는거 다시한번 
//ValurOf() (String, Integer)
//예~~ 답 안보고 푼거 처음이다!!! 희석님의 가르침 만만세!!!