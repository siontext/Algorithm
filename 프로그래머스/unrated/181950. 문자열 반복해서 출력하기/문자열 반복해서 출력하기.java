import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String AAA = sc.next(); //string  //sc.next(); => string
        int B = sc.nextInt(); //5
        
        for(int i = 0; i < B; i++ ){ //i는 0부터 시작해서 n보다 작을때까지 반복
        System.out.printf(AAA);
        }
    }
}
    //일단 n= 지금 5임
    //for문을 사용해서 n을 5번 돌리고
    //sc.nextInt();는 Java에서 Scanner 클래스를 사용하여 정수를 입력 받는 코드
   //sc.next;는 공백을 기준으로 한 단어 또는 한 문자씩 입력받는다.