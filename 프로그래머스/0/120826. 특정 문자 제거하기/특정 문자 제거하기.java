class Solution {
    public String solution(String my_string, String letter) {
        
        String a = my_string.replace(letter, "");
        
        return a;
    }
}

//문자열 끼리 빼는게 가능한가?
//반복문으로 -> 문자열을 문자로 만들고, 문자끼리 빼야하나?
//String 클래스에 특정 문자열을 제거하는 replace()라는 메서드가 존재하네??