import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int min = A * 60 + B; //전체 시간을 "분"으로 바꾸기
        min += C;// 요리하는 시간까지 합치기
        
        int hour = (min / 60) % 24; //시간 (24시가 넘으면 0시로 다시시작)
        int minute = min % 60; //분
        
        System.out.println(hour + " " + minute);
        
    }
}