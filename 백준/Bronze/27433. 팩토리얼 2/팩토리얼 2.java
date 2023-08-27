import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // N! = N * (N-1)!
        long[] arr = new long[N + 1];
        arr[0] = 1;
        for (int i = 1; i <= N; i++) {
            arr[i] = i * arr[i - 1];
        }

        System.out.println(arr[N]);

    }
}