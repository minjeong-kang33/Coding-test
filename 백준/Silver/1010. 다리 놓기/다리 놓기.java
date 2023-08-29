import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[][] pair = new int[30][30];
        for (int i = 0; i < 30; i++) {
            pair[i][i] = 1; // 양 쪽의 사이트의 갯수가 같을 경우
            pair[i][0] = 1; // 오른쪽 사이트가 존재하지 않을 경우
        }

        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                // M개중 N개를 뽑아야하므로 mCn
                // (m+1)C(n+1) = mCn + mC(n+1)의 공식을 이용
                pair[i][j] = pair[i - 1][j - 1] + pair[i - 1][j];
            }
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(pair[M][N]).append('\n');
        }

        System.out.println(sb);
    }
}