import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //바구니의 개수
        int M = sc.nextInt(); //공을 넣는 횟수
        
        int[] B = new int[N]; //총 바구니 갯수(배열)
        
        //M번 공을 넣기
        for(int m=0; m<M; m++){
            int i = sc.nextInt(); //시작 바구니
            int j = sc.nextInt(); //끝 바구니
            int k = sc.nextInt(); //바구니에 넣을 숫자
            
            //바구니에 공 넣어주기
            for(int idx = i-1; idx<j; idx++){
                B[idx] = k;
            }
        }
        
        //결과 출력하기
        for(int ll = 0; ll<N; ll++){
         System.out.print(B[ll] + " ");   
        }        
        
        
        
    }
}