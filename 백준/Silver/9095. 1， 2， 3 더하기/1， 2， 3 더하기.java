import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // dp[1] = 1
        // dp[2] = 2 (1+1), 2
        // dp[3] = 4 (1+1+1), (1+2), (2+1), 3
        // dp[4] -> 4는 1+3이자 2+2이자 3+1이므로,
        //          1+dp[3]=(('1'+1+1+1), ('1'+1+2), ('1'+2+1), '1'+3), 2+dp[2]=(('2'+1+1), '2'+2), 3+dp[1]=('3'+1)으로 7이됨
        //          즉 dp[4] = dp[3] + dp[2] + dp[1]으로 표현가능
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int[] dp = new int[11];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            for (int j = 4; j <= num; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }

            System.out.println(dp[num]);
        }
    }
}