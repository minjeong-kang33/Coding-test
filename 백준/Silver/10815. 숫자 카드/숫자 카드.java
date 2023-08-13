import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] card;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // 가지고있는 카드 개수

        card = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(card); // 이분탐색을 위해 정렬

        int M = Integer.parseInt(br.readLine()); // 확인해야하는 숫자의 개수
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (binary(num) == true) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }

    private static boolean binary(int num) {
        int start = 0;
        int end = N - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (card[middle] == num) {
                return true;
            } else if (card[middle] < num) {
                // 중간값보다 찾는 숫자가 더 크다면 시작값을 중간값보다 크게 조절
                start = middle + 1;
            } else {
                // 중간값보다 찾는 숫자가 더 작다면 끝값을 중간값보다 작게 조절
                end = middle - 1;
            }
        }
        return false;
    }
}