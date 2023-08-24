import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        // 배열을 이용해서 인덱스 사용. 순차적 데이터 추가/삭제이므로 Array 사용
        Deque<int[]> deque = new ArrayDeque<>();

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            // 각 풍선의 종이에 적힌 숫자를 배열에 담음
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 1번 풍선을 제일 먼저 터뜨리고 종이의 숫자를 변수에 담음
        sb.append("1 ");
        int num = arr[0];

        for (int i = 1; i < N; i++) {
            // 2번 풍선부터 각 풍선의 번호와 종이의 숫자를 배열에 저장
            deque.add(new int[]{(i + 1), arr[i]});
        }

        while (!deque.isEmpty()) {
            // 종이의 숫자가 양수일 경우
            if (num > 0) {
                // 현재 위치에서 풍선을 덱에서 빼서 다시 뒤로 추가함으로써 오른쪽으로 이동
                for (int i = 1; i < num; i++) {
                    deque.add(deque.poll());
                }
                // 이동을 마치면 현재 위치의 풍선을 터뜨림
                // 여기서 nxt배열의 0번째 값은 풍선의 번호, 1번째 값은 종이의 숫자가 됨
                int[] nxt = deque.poll();
                num = nxt[1]; // 터뜨린 풍선에 있던 종이의 숫자를 저장. 다음 풍선을 터뜨릴 때 사용
                sb.append(nxt[0] + " "); // 터뜨린 풍선의 번호를 출력
            }
            // 종이의 숫자가 음수일 경우
            else {
                for (int i = 1; i < -num; i++) {
                    deque.addFirst(deque.pollLast());
                }

                int[] nxt = deque.pollLast();
                num = nxt[1];
                sb.append(nxt[0] + " ");
            }
        }
        br.close();
        System.out.println(sb);
    }
}