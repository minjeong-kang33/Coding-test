import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	static int N, M, R;
	static int visited[]; // 방문한 정점을 기록할 배열
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 정점들의 정보를 기록할 그래프

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); // 정점의 수
		M = Integer.parseInt(st.nextToken()); // 간선의 수
		R = Integer.parseInt(st.nextToken()); // 시작 정점

		visited = new int[N + 1];

		// graph의 index를 정점의 개수만큼 만들어줌
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			// 무방향이기 때문에 양쪽으로 정보를 추가
			graph.get(start).add(end);
			graph.get(end).add(start);
		}

		for (int i = 1; i <= N; i++) {
			Collections.sort(graph.get(i));
		}

		// 너비 우선 탐색 시작
		bfs(R);

		for (int i = 1; i <= N; i++) {
			System.out.println(visited[i]);
		}
	}

	// 너비 우선 탐색 메서드
	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		// 방문한 정점의 순서
		int count = 1;

		// 큐에 시작정점을 저장하고, visited[]에 count=1를 대입한 뒤 count를 증가시켜둠
		queue.offer(start);
		visited[start] = count++;

		while (!queue.isEmpty()) {
			// 큐에서 정점을 꺼내어 저장. now=현재 탐색하는 정점
			int now = queue.poll();

			// now와 연결된 정점을 탐색
			for (int i = 0; i < graph.get(now).size(); i++) {
				int next = graph.get(now).get(i);

				// 이미 방문한 정점일 경우 건너뜀
				if (visited[next] != 0) {
					continue;
				}

				// 큐에 해당 정점을 저장하고 순서값을 부여한 후 count값을 증가시켜둠
				queue.offer(next);
				visited[next] = count++;
			}
		}
	}
}