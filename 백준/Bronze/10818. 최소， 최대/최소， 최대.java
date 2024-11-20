import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] X = new int[N];
        for(int i=0; i<N; i++){
            X[i] = sc.nextInt();
        }
        
        // 초기 최대값과 최소값을 배열의 첫 번째 값으로 설정
        int min = X[0];
        int max = X[0];
        
        // 배열을 순회하면서 최솟값과 최댓값 찾기
        for(int i=1; i<N; i++){
            if(X[i] < min){
                min = X[i];
            }
            if(X[i] > max){
                max = X[i];
            }
        }
        
        System.out.println(min + " " + max);
        
        
        
        
    }
}