class Solution {
    public String solution(String my_string, int n) {
        
        String emty = "";
        
        for(int i=0; i < my_string.length(); i++){
            for(int j=0; j < n; j++){
                emty += my_string.charAt(i);
            }
        }
        return emty;

    }
}