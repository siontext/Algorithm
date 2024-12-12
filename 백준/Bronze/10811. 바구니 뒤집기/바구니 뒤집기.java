import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 변경 횟수

        int[] basket = new int[N]; // 바구니 배열
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1; // 바구니 초기화
        }

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt() - 1; // 시작 인덱스 (0부터 시작)
            int end = sc.nextInt() - 1; // 끝 인덱스 (0부터 시작)

            // start부터 end까지 역순으로 변경
            while (start < end) {
                int temp = basket[start];
                basket[start] = basket[end];
                basket[end] = temp;
                start++;
                end--;
            }
        }

        // 결과 출력
        for (int num : basket) {
            System.out.print(num + " ");
        }
    }
}