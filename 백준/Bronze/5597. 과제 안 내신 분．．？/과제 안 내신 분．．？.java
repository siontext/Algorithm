import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        boolean[] students = new boolean[30];// 총 학생 수
        
        for(int i=0; i<28; i++){
            int success = sc.nextInt(); //과제를 제출한 학생 번호
            students[success - 1] = true; //해당 학생 번호에 해당하는 인덱스를 true 로 설정
        }
        
        //과제를 제출하지 않은 학생 출력
        for(int i=0; i<30; i++){
            if(!students[i]){ //false인 경우 학생은 과제제출 X
                System.out.println(i + 1); //학생 번호를 출력하기 (번호는 배열 인덱스 + 1)
            }
        }
        
    }
}