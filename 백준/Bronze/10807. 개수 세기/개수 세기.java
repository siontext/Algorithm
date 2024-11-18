import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] nums = new int[N]; // N개의 정수를 저장할 배열 선언
        
        // 배열에 N개의 정수 입력받기
        for(int i=0; i<N; i++){
            nums[i] = sc.nextInt();
        }
        
        int V = sc.nextInt();
        int count = 0;
        
        for(int i=0; i<N; i++){
            if(V == nums[i]){
                count++;
            }
        }
        
        System.out.println(count);
        
        
    }
} 