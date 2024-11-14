import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()){ //입력이 있는동안 반복
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println(a+b);
        }
        
    }
}

// hasNextInt()는 다음 입력이 정수인지 아닌지를 미리 검사하는 메서드 만약 읽을 수 있는 정수가 있다면 true를 반환하고, 그렇지 않으면 false를 반환