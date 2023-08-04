import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        // 큐의 가장 뒤에 있는 정수를 출력해야하므로 양방향 입출력가능한 데크사용
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            switch (order) {
                case "push": { // 정수 X를 큐에 넣는 연산
                    int num = Integer.parseInt(st.nextToken());
                    deque.add(num);
                    break;
                }
                case "pop": { // 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력
                    if (deque.size() == 0) { // 정수가 없는 경우에는 -1을 출력
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.poll()).append("\n");
                    }
                    break;
                }
                case "size": { // 큐에 들어있는 정수의 개수를 출력
                    sb.append(deque.size()).append("\n");
                    break;
                }
                case "empty": { // 큐가 비어있으면 1, 아니면 0을 출력
                    if (deque.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                }
                case "front": { // 큐의 가장 앞에 있는 정수를 출력
                    if (deque.isEmpty()) { // 정수가 없는 경우에는 -1을 출력
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.peek()).append("\n");
                    }
                    break;
                }
                case "back": { // 큐의 가장 뒤에 있는 정수를 출력
                    if (deque.isEmpty()) { // 정수가 없는 경우에는 -1을 출력
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.peekLast()).append("\n");
                    }
                    break;
                }
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}