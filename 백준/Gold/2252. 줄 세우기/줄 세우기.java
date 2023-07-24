import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 학생(정점)의 수
		int M = sc.nextInt(); // 비교(노드)한 횟수
		
		// 학생 별 ArrayList 생성
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			A.add(new ArrayList<>());
		}
		
		int indegree[] = new int[N + 1]; // 진입차수 배열
		for (int i = 0; i < M; i++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			A.get(S).add(E);
			indegree[E]++; // 진입차수 배열값 증가
		}

		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			// 진입차수 배열값이 0인 학생만 큐에 삽입
			if (indegree[i] == 0) {
				queue.offer(i);
			}
		}

		while (!queue.isEmpty()) {
			int now = queue.poll();
			System.out.print(now + " ");
			// 현재 학생과 연결된 모든 노드를 순회하며 진입차수 배열값을 감소시키고
			// 값이 0이되면 큐에 삽입
			for (int next : A.get(now)) {
				indegree[next]--;
				if (indegree[next] == 0) {
					queue.offer(next);
				}
			}
		}

	}
}