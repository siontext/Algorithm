class Solution {
    public double solution(int[] arr) {
        double sum = 0;
    
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        
        return sum/arr.length;
        
    }
}
//다 더해서 avg해야하나?