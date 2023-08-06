import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        sb.append('<');

        while (queue.size() > 1) { // 마지막 요소만 남기고
            for (int i = 0; i < K - 1; i++) {
                // 현재 맨 앞에 있는 값을 맨 뒤로 옮김
                int temp = queue.poll();
                queue.add(temp);
            }
            // K번째 원소 = for문 종료 후 맨 앞에 있는 값이므로 출력
            sb.append(queue.poll()).append(", ");
        }

        // 제일 마지막 값 출력
        sb.append(queue.poll()).append('>');
        System.out.println(sb);
    }
}