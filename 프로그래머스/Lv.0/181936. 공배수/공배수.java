class Solution {
    public int solution(int number, int n, int m) {
        
        if(number % n == 0 && number % m == 0) {
            return 1;
        }else {
            return 0;
        }
    }
}

//어제랑 비슷하면서 다른??
// if절 당연히 AND 를 써야할듯  + 삼항연산자 써보자 (삼항 연산자 안되는듯?)
// a AND b(a, b 조건에 둘다 속해야함)