class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
            }   
        }
        return answer;
    }
}
//배열 요소중 "kim"의 배열 위치 x를 찾아
//김서방은 x에 있다 라고 반환
//for 문으로 스트링 배열을 돌리고 
//if문에서 Kim 배열을 찾으면 순번을 반환하기 