class Solution {
    public int solution(int[] num_list) {
        int num = 0; //담을거
        int sum = 0; //합친거 담을거
        int mul = 1; //곱한거 담을거
        
        for(int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mul *= num_list[i];
        }
        
        if(sum * sum > mul){
            num = 1;
        }
        
        return num;
        
        
    }
}

//모든 원소들의 곱이 < 원소들의 합의 제곱보다 작으면 1반환
//모든 원소들의 곱이 > 원소들의 합의 제곱보다 크면 0반환

//for문으로 배열을 돌려서 곱을 구하고
//곱이랑 합의 제곱이랑 비교