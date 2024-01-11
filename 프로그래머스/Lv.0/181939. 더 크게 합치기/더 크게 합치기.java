class Solution {
    public int solution(int a, int b) {
        
        //정수를 문자열로 변환 그리고 문자열 합치기
        String ab = String.valueOf(a) + String.valueOf(b); //991
        String ba = String.valueOf(b) + String.valueOf(a); //919
        
        //문자열로 합쳐진 숫자를 정수화해주는 작업.
        int abValue = Integer.valueOf(ab);
        int baValue = Integer.valueOf(ba);
        
        if(abValue > baValue) {
            return abValue;
        }else
            return baValue;
 
        
    }
}
//String.valueOf(), Integer.valueOf() 메서드를 배울수 있었음 
//String.valueOf()  변수를 => string으로 형변환 가능
//Integer.valueOf() 변수를 => int로 형변환 가능
