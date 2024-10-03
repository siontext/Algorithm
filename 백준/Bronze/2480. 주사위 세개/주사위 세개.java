import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //주사위 눈이 다 다를때
        if (a != b && b != c && a != c) {
            int max;
            // 만약 a > b 라면
            if (a > b) {
                // c > a > b 라면
                if (c > a) {
                    max = c;
                }
                // a > (b, c)
                else {
                    max = a;
                }
            }
            // b > a 라면
            else {
                // c > b > a 라면
                if (c > b) {
                    max = c;
                }
                // b > (a, c)
                else {
                    max = b;
                }
            }
            System.out.println(max * 100);
        } else {
            // 같은 눈이 3개라면
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
            }
            //a가 b or c랑만 같은경우
            else {
                if (a == b || a == c) {
                    System.out.println(1000 + a * 100);
                }
                else {
                    System.out.println(1000 + b * 100);
                }
            }

        }




    }

}
