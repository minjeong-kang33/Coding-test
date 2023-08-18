import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>(); // 숫자와 개수의 쌍으로 이루어진 map

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            // key값인 숫자가 이미 map안에 존재하면 개수를 뜻하는 value에 1을 더함
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                // 처음 등장하는 key일 경우 value에 1을 넣어 map에 저장
                map.put(num, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            // map에서 num이라는 key를 가진 값을 탐색하고 없으면 0을 출력
            sb.append(map.getOrDefault(num, 0)).append(' ');
        }

        System.out.println(sb);

    }
}
