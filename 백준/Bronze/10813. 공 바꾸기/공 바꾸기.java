import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //총 바구니 갯수
        int M = sc.nextInt(); //공을 바꿀 횟수
        
        // 초기 바구니 상태 설정 (각 바구니에 해당 번호의 공이 들어있음)
        int[] basket = new int[N];
        for(int i=0; i<N; i++){
            basket[i] = i + 1;
        }
        
        // M번 공을 교환
        for(int m=0; m<M; m++){
            int i = sc.nextInt(); // 교환할 첫번째 바구니 번호
            int j = sc.nextInt(); // 교환할 두번째 바구니 번호
            
            //두 바구니의 공을 교환 (인덱스는 0부터 시작함으로 i-1, j-1 사용)
            int temp = basket[i-1]; // 1. 첫 번째 값을 임시 변수에 저장 (유실방지위한 임시저장)
            basket[i-1] = basket[j-1]; // 2. 두 번째 값을 첫 번째 위치에 대입
            basket[j-1] = temp; // 3. 임시 변수에 저장한 첫 번째 값을 두 번째 위치에 대입
        }
        
        //출력하기
        for(int i=0; i<N; i++){
            System.out.print(basket[i] + " ");
        }
        
    }
}