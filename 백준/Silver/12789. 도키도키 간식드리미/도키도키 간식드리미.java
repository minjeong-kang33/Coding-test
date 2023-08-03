import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 학생 수

        // 대기열 = queue(선입선출), 추가대기열 = Stack(후입선출)
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }

        int num = 1; // 1번부터 배부받음
        while (!queue.isEmpty()) {
            if (queue.peek() == num) { // 기존 대기열 먼저 확인 (차례가 맞다면)
                queue.poll();
                num++;
            } else if (!stack.isEmpty() && stack.peek() == num) { // 추가 대기열확인 (차례가 맞다면)
                stack.pop();
                num++;
            } else {
                // 대기열에 있는 사람을 추가 대기열로 이동
                stack.push(queue.poll());
            }
        }
        
        // 기존 대기열 확인이 모두 끝나면 추가 대기열만 재확인
        while (!stack.isEmpty()) {    
            if (stack.peek() == num) {    
                stack.pop();
                num++;
            } else {    
                System.out.println("Sad");
                return;
            }
        }
        
        System.out.println("Nice");
    }
}
