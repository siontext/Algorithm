import java.util.*;
class Solution {
    public int solution(int[] array) {
        
        int maxCount = 0;
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();  
        //정수 값과 해당 값의 빈도수를 저장하기 위한 HashMap을 생성합니다.
        
        for(int number : array) { //어차피 전부 돌거라 for each문, 배열이라 빈도 
            int count = map.getOrDefault(number, 0) + 1; 
            //map 에서 현재 숫자에 해당하는 빈도수를 가져옴, 만약 해당 숫자가 맵에 없으면 기본값으로 0 , 그 후, 빈도수를 1 증가
         
              if(count > maxCount) { 
                maxCount = count;
                answer = number;
        //for문에서 카운트세서 count가 > maxCount보다 크면 -> 최빈값을 업데이트 -> answer 변수에 현재숫자 저장
            
            }else if (count == maxCount) {
                  answer = -1;
                //count(현재 숫자의 빈도수)가 최빈값과 같다면, 최빈값이 여러개이므로 answer을 -1로 설정              
              }
            
        
            map.put(number, count); 
            //현재 숫자의, 빈도를 맵에 업데이트
        }
        
        return answer;
        //최빈값, 또는 -1반환
}
}

