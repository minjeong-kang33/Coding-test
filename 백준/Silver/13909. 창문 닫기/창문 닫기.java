import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 창문의 수, 사람의 수
        int count = 0;

        /*boolean[] window = new boolean[N + 1];
        for (int i = 1; i <= N; i++)
            for (int j = i; j <= N; j += i) {
                if (window[j]) window[j] = false;
                else window[j] = true;
            }
        for (int i = 1; i <= N; i++) {
            if (window[i]) count++;
        }
        System.out.println(count);*/

        // 규칙 확인 -> N이 1~3일때는 1, N이 4~8일때는 2, N이 9~15일때는 3이므로
        //            count의 값은 주어진 N을 제곱근으로 나눠 소수점 이하의 수를 버린 결과
        System.out.println((int) Math.floor(Math.sqrt(N)));

    }
}