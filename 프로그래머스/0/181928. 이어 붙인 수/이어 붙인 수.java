class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String a = "";
        String b = "";
        
        for(int num : num_list){
            if(num % 2 == 1){
                a += num; //문자열변환하면 이어붙이기 쌉가능
            } else {
                b += num;
            }
        }
        
        return Integer.parseInt(a) + Integer.parseInt(b); //다시 정수로 만들어서 더하기
    }
}

//배열에서 %2 0이된 수랑 1이된 수를 구분하고 더해야함