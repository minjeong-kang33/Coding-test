import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(in.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(in.readLine());
            if (num == 0) {
                sb.append(queue.size() == 0 ? 0 : queue.poll()).append('\n');
            }else{
                queue.add(num);
            }
        }

        System.out.println(sb);
    }
}