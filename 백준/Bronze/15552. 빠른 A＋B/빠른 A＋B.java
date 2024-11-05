import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int num = Integer.parseInt(br.readLine()); //테스트 케이스 개수 입력
        
        for(int i = 0; i < num; i++){
            String[] input = br.readLine().split(" "); // 공백으로 나눈 문자열 배열로 저장
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            bw.write((A + B) + "\n"); // 결과를 버퍼에 저장
        }
        
        bw.flush(); // 버퍼에 담긴 내용을 모두 출력
        bw.close();
        br.close();
    }
}

//BufferedReader는 입력을 버퍼에 저장해 한 번에 읽어들이는 방식
//BufferedReader를 사용하면 모든 입력을 문자열(String) 형태로 읽어오기 때문에, 필요한 경우 적절한 형으로 변환해 주어야 합니다.
