import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //100, 1
        
        if(n % 2 == 1) { //홀수면 (나머지1)
            System.out.printf(n + " is odd");
        } else {
            System.out.printf(n + " is even");
        }
        
        //if 함수가 사용인것 같음. 
        //메서드 어떻게 쓰는지 몰라서 홀수표현방법과 if형식 검색함 
    }
    
}