class Solution {
    public int solution(int a, int b, boolean flag) {
        if(flag == true) {
            return a + b;
        } else {
            return a - b;
        }
        
    }
}
//if절을 사용해서 매개변수가 참이면, 거짓이면 => 리턴값을 주기 하면 될 것같다.