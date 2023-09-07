import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());

        List<Integer> list[] = new ArrayList[N + 1];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a); // 양방향 연결
        }

        boolean visit[] = new boolean[N + 1]; // 방문여부
        Queue<Integer> queue = new LinkedList<>(); // BFS 탐색을 위함
        queue.add(1); // 시작노드인 1 추가
        visit[1] = true;
        int ans[] = new int[N + 1]; // 각 노드의 부모노드 저장

        // BFS 탐색으로 각 노드의 부모노드 찾음
        while (!queue.isEmpty()) {
            Integer num = queue.poll(); // 현재 처리할 노드를 하나 선택
            for (Integer i : list[num]) { // 그와 연결된 모든 자식노드 탐색
                if (!visit[i]) {
                    visit[i] = true;
                    ans[i] = num; // 배열의 i(자식)에 부모노드 값을 저장해둠
                    queue.add(i); // queue에 자식노드를 담아두어 자식의 자식도 탐색되도록 함
                }
            }
        }

        // ans[]에는 각 노드의 부모노드가 저장되어있고, 1번노드는 부모노드가 없으므로 2부터 시작
        for (int i = 2; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}