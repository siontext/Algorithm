class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++){
            if(n % i == 1) {
            answer = i; 
            break;          
            }
        }
        return answer;
    }
}

//내가 생각한 해결법:배열을 만들어서 n을 나눌수 있는 값을 다 담고 -> sort정렬해서 가장 작은값을 리턴하면 될거 같은데?
//실제 해결방법: 1부터 나머지 1되는거 찾고 바로 브레이크 하면 -> 그게 제일 작은값임 ㄷㄷ

