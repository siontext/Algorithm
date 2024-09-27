import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if(M < 45){ //45분보다 작으면
            H--; // 한 시간을 뺍니다
            M = 60 - (45 - M);// 60분에서 45과 입력받은 시간을 뺍니다
            
            if(H < 0){ //0시 아래로 내려가면
                H = 23;
            }
        } else{
            M = M - 45; // 45분 이상일 경우 그냥 뺍니다.
        }
        
        
        System.out.println(H + " " + M);
        
        

	}
}

//H는 0~24 가 범위가 되고
//M은 1~60 까지의 범위가 되네 
