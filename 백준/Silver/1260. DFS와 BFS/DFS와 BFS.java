import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int start = sc.nextInt();

        A = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        // 양방향으로 노드 연결
        for (int i = 0; i < M; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            A[S].add(E);
            A[E].add(S);
        }
        // 각 ArrayList의 값 오름차순으로 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }

        visited = new boolean[N + 1];
        DFS(start); // DFS 실행
        System.out.println();

        visited = new boolean[N + 1];
        BFS(start); // BFS 실행
        System.out.println();
    }

    private static void BFS(int Node) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(Node);
        visited[Node] = true;

        while (!queue.isEmpty()) {
            int now_Node = queue.poll();
            System.out.print(now_Node + " ");
            for (int i : A[now_Node]) {
                // 연결된 노드 중 방문하지 않은 노드를 큐에 삽입하고 배열에 기록
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    private static void DFS(int Node) {
        System.out.print(Node + " ");
        visited[Node] = true;

        for (int i : A[Node]) {
            // 연결된 노드 중 방문하지 않은 노드로 DFS 실행 (재귀 함수)
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}