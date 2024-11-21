import java.util.Scanner;

public class Main{
     public static void main(String[] args){
         
         
         Scanner sc = new Scanner(System.in);
         
         int[] X = new int[9];// 9개의 정수를 저장할 배열 선언
         int max = X[0]; //최대값을 찾기 위해 배열의 0번째부터 찾음
         int maxIndex = 0; //몇번째 수인지 새기위해 0 선언
         
         
         for(int i=0; i<9; i++){ // 배열에 9개의 정수를 입력받기
             X[i] = sc.nextInt();
             
             // 최대값과 그 위치를 찾기
             if(X[i] > max){
                 max = X[i];
                 maxIndex = i + 1;
             }
         }

         System.out.println(max);
         System.out.println(maxIndex);
         
     }
 }