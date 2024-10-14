import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int q = sc.nextInt();
        
        if(q >=1 && q<=9){
            for(int i = 1; i <= 9; i++){
                System.out.println(q + " * " + i  + " = " + q*i);
            }
        }
        
    }
}