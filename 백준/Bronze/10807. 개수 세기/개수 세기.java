import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        
        Scanner sc =  new Scanner(System.in);
        
        int N = sc.nextInt();// 정수 개수 입력
        int[] numbers = new int[N]; //길이가 N인 배열 생성
        
        // 배열에 정수 입력 받기
        for(int i=0; i < N; i++){
            numbers[i] = sc.nextInt();
        }
        
        //셋째 줄 찾으려고 하는 정수 입력
        int x = sc.nextInt();
        int count = 0; // 찾으려는 v의 개수
        
        for(int i=0; i<N; i++){
            if(x == numbers[i]){
                count ++;
            }
        }
        
        System.out.println(count);
       
    }
}