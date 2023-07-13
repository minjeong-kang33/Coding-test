import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	static int N, M;
	static boolean[][] visited;
	static int[][] arr;
	// 상하좌우를 탐색하게 하는 배열.
	// dx, dy의 값이 0,1일 경우 '하'/ 1,0일 경우 '우'/ 0,-1일 경우 '상'/ -1,0일 경우 '좌'로 이동
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 세로
		M = Integer.parseInt(st.nextToken()); // 가로

		arr = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken(); // 수들이 붙어서 주어지므로 한 줄로 입력받고 substring으로 쪼개서 저장

			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(line.substring(j, j + 1));
			}
		}

		BFS(0, 0);
		System.out.println(arr[N - 1][M - 1]); // 인덱스가 0부터 시작하므로

	}

	private static void BFS(int i, int j) {
		// 큐 정의 후 데이터 삽입
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] { i, j });

		// 큐에 데이터가 존재하는 한
		while (!queue.isEmpty()) {
			// 현재 큐의 자리를 확인 후, 방문했다는 표시 저장
			int[] now = queue.poll();
			visited[i][j] = true;
			// 상하좌우로 이동하며 탐색
			for (int k = 0; k < 4; k++) {
				// k가 0일때 y만 증가하므로 '아래'로 이동, k가 1일때 x만 증가하므로 '오른쪽'으로 이동, ...
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				// x값과 y값이 배열 안에서 존재하는 값이고,
				if (x >= 0 && y >= 0 && x < N && y < M) {
					// 값이 0이 아니라 방문할 수 있음 + 아직 방문하지 않은 곳일때,
					if (arr[x][y] != 0 && !visited[x][y]) {
						visited[x][y] = true; // 이제는 방문했음을 알림
						arr[x][y] = arr[now[0]][now[1]] + 1; // 직전의 값의 depth에 +1해줌
						queue.add(new int[] { x, y }); // 새로운 값을 queue에 담아 다시 탐색하게 함

					}
				}
			}
		}

	}
}