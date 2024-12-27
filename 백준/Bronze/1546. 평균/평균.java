import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //시험을 본 과목의 갯수
        
        double[] num = new double[N]; //현재 성적이 담길 배열 
        double M =0; //최대값
        double[] newNum = new double[N]; //새로 계산된 성적이 들어갈 배열
        double sum =0;//새 평균
        
        //현재 성적 입력 (3개중에 최대값이 존재)
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt(); //현재 성적을 배열에 담음
            if(num[i] > M){
                M = num[i]; //최대값 구하기
            }
        }
        
        //모든 성적을 -> 성적/최대값*100으로 만들기
        for(int i=0; i<num.length; i++){
            newNum[i] = num[i]/M*100;
        }
        
        
        //평균 새로 계산하기
        for(int i=0; i<newNum.length; i++){
            sum += newNum[i];
        }
        
        System.out.println(sum/N);
        
        
    }
}

//첫째줄 입력은 시험본 과목의 갯수 N
//둘째줄 입력은 현재 성적 (최대값이 존재)
//모든 성적을 => 현재성적/최대갑*100 이 되어야함
//출력은 새로 계산한 성적이 되어야 함