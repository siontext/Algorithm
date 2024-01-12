class Solution {
    public int solution(int a, int b) {
        
        //정수를 문자열로 변환 그리고 문자열 합치기
        String ab = String.valueOf(a) + String.valueOf(b); //991
        String ba = String.valueOf(b) + String.valueOf(a); //919
        
        //문자열로 합쳐진 숫자를 정수화해주는 작업.
        int abValue = Integer.valueOf(ab); //991 (정수)
        int baValue = Integer.valueOf(ba); //919
        
        if(abValue > baValue) {
            return abValue;
        } else {
            return baValue;
        }
        
    }
}