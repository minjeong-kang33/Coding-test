import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static boolean[] visited; // 방문 기록 저장
	static ArrayList<Integer>[] arr; // 방문 배열

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 노드 개수
		int M = Integer.parseInt(st.nextToken()); // 엣지 개수

		visited = new boolean[N + 1]; // 0번 인덱스 사용x
		arr = new ArrayList[N + 1]; // 0번 인덱스 사용x

		// 각 인덱스 = 즉, 1번에서 N번까지의 노드에 대한 ArrayList를 생성
		for (int i = 1; i < N + 1; i++) {
			arr[i] = new ArrayList<Integer>();
		}

		// 받은 엣지의 개수만큼 반복하며 데이터 입력
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			// 노드s를 시작점, 노드e를 종료점으로서 받고 양방향으로 연결
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arr[s].add(e);
			arr[e].add(s);
		}

		int count = 0;
		for (int i = 1; i <= N; i++) {
			// 방문하지 않은 노드가 존재하면 연결 요소의 개수인 count를 증가시킨 후, DFS 실행
			if (!visited[i]) {
				count++;
				DFS(i);
			}
		}

		System.out.println(count);
	}

	public static void DFS(int v) {
		// 현재노드가 방문 노드이면 아무것도 하지않고 종료
		if (visited[v]) {
			return;
		}
		// 방문 노드가 아니면 이제는 방문했다는 뜻으로 값을 true로 변경 후,
		visited[v] = true;
		// 현재 노드와 연결되어 있는 노드 중 아직 방문하지 않은 노드를 찾아 다시 DFS 실행
		for (int i : arr[v]) {
			if (!visited[i]) {
				DFS(i);
			}
		}
	}
}