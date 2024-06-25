class Solution {
    public boolean solution(int x) {
        
        char[] chars = Integer.toString(x).toCharArray();
        
        int result = 0;
        
        boolean answer = true;
        
        for(int i = 0; i < chars.length; i++) {
            int aa = Integer.parseInt(chars[i] + "");
            result += aa;
        }
        
        if(x % result == 0){
            return answer;
        } else {
            return !answer;
        }
    }
}

//1+8=9
//18은 9로 나누어 떨어지므로 18은 하샤드 수

//18 -> 1, 8
//for 문 -> 문자를 다시 숫자로 바꾸고 반복마다 더하기
//안의 중첩 if 문으로 원래 x와 나눠서 나눠지면 true 반환