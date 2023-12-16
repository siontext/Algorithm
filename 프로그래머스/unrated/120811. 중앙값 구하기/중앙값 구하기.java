import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array); //array가 현재 매개변수임 
        answer = array[array.length / 2];
            
        return answer;
    }
}
//import java.util.*; 불러오기

//Array로 배열을 만들고 sort로 ->array를 오름차순(낮은거부터)으로 정렬
// answer을 array에 대입 -> array의 배열길이를 2로 나눔 (그러면 중앙값 나옴)