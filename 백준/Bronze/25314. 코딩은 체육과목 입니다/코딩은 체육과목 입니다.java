import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int bb = num/4;
        
        String str = "";
        
        for(int i = 1; i <= bb; i++){
            str += "long ";
        }
        
        System.out.println(str + "int");
        
        
    }
}

// 4의 배수가 입력되면 4로 나눈 횟수만큼 long을 반복하고 int를 붙힘
//num 을 4로 나누고 나눈 값 만큼 long 붙히기