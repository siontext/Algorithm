import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
  
        // 첫 줄엔 총 금액
        // 두번째 줄엔 물건의 종류 수
        // 다음 부턴 가격과 개수
        
        int sum = sc.nextInt(); // 총 금액
        int num = sc.nextInt(); // 물건의 종류 수
        
        int total = 0; // 계산한 총액
        
        
        for(int i = 0; i < num; i++){
            int a = sc.nextInt(); // 물건의 가격
            int b = sc.nextInt(); // 물건의 개수
            total += a * b; // 가격 * 개수를 총액에 더함
        }
        
        // 계산한 총액이 주어진 총 금액과 일치하는지 확인
        if(total == sum) System.out.println("Yes");
        else System.out.println("No");
        

    }
}