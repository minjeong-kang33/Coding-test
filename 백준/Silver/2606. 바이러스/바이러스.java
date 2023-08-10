import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int node, line;
    static int[][] arr;
    static boolean[] check;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        line = sc.nextInt();

        arr = new int[node + 1][node + 1];
        check = new boolean[node + 1];

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= line; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            
            // 양방향으로 연결
            arr[start][end] = arr[end][start] = 1;
        }

        dfs(1); // 1번 노드부터 시작
        System.out.println(count - 1); // 1번 노드를 제외해야하므로 -1
    }

    private static void dfs(int start) {
        check[start] = true; // 방문했으므로 체크
        count++;

        for (int i = 0; i <= node; i++) {
            // 연결된 값이고 아직 방문하지않았으면 재귀
            if (arr[start][i] == 1 && !check[i]) {
                dfs(i);
            }
        }
    }
}