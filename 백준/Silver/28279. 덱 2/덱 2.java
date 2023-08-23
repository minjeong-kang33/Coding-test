import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.pollFirst()).append("\n");
                    break;
                case 4:
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.pollLast()).append("\n");
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    if (deque.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case 7:
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.getFirst()).append("\n");
                    break;
                case 8:
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.getLast()).append("\n");
            }
        }
        br.close();
        System.out.println(sb);
    }
}