import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        boolean[] flag = new boolean[100001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            // 받은 수가 1 즉, stack을 나타내면 배열 flag에 true로 저장
            // 받은 수가 0, queue를 나타내면 배열 flag에 false로 저장
            if (Integer.parseInt(st.nextToken()) == 1) {
                flag[i] = true;
            } else {
                flag[i] = false;
            }
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (!flag[i]) { // queue일 때만 deque에 원소 삽입
                deque.offerLast(a);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int b = Integer.parseInt(st.nextToken());
            deque.offerFirst(b); // 추가하는 원소를 deque의 제일 앞에 추가
            sb.append(deque.peekLast()).append(" "); // 현재 deque의 가장 마지막 값 출력
            deque.pollLast(); // 출력한 가장 마지막 값을 삭제
        }
        System.out.println(sb);
    }
}