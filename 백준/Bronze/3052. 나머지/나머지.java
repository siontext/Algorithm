import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
       
        //서로 다른 나머지를 저장하기 위해 Set 자료구조 사용
        HashSet<Integer> na = new HashSet<>();
        
        //10개의 숫자를 입력받기
        for(int i=0; i<10; i++){
            int number = sc.nextInt(); //숫자 입력받기
            int nana = number % 42; //42로 나눈 나머지 계산
            na.add(nana); //set에 추가하기
        }
        
        //set의 크기를 출력하기 (나머지 갯수)
        System.out.println(na.size());

    }
}

//서로 다른 나머지를 구하기 위해서는 Set 자료구조를 사용하는 것이 적절하다.