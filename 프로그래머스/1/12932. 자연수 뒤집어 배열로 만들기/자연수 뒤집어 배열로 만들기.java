class Solution {
    public int[] solution(long n) {
     
        String stst = String.valueOf(n); //자연수n을 -> 문자열로 (1, 2, 3, 4, 5)

        int[] answer = new int[stst.length()];//int 배열 생성, 배열길이는 aaa길이만큼 (0, 0, 0, 0, 0)
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(stst.substring(answer.length-1-i, answer.length-i));
            //substring(범위시작(포함X), 범위끝(포함X)) -> (0번배열~0번배열) (1번 ~ 1번) //왜 역순으로 저장되는거지??
        }
        return answer;
    }
}

// 자연수 n을 -> 문자열로
// 배열을 생성해서 -> 자연수 n의 길이만큼 배열 설정
//for문으로 하나씩 배열에 숫자를 담아주고 