class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i); //aaaaa
            answer += str2.charAt(i); //bbbbb
        }  //ababababab a한번 b한번씩 호출됨
        return answer;
    }
}

//문자열로 하나씩 나눠주고 섞어야하나??
//System.out.print를 쓰는 기준하고 return쓰는기준의 차이는 뭘까?