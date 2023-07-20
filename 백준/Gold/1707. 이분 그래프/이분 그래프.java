import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class Main {
	static ArrayList<Integer>[] A;
	static int[] check; // 이분 그래프 체크
	static boolean[] visited; // 방문 기록 저장
	static boolean IsEven;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int t=0; t<testCase; t++) {
			String[] s = br.readLine().split(" ");
			int V = Integer.parseInt(s[0]); // 노드 개수
			int E = Integer.parseInt(s[1]); // 엣지 개수
			A = new ArrayList[V+1]; // 0번 인덱스 사용X
			visited = new boolean[V+1];
			check = new int[V+1];
			IsEven = true;
			
			for(int i=1; i<=V; i++) {
				A[i] = new ArrayList<Integer>();
			}
			//에지 데이터 저장
			for(int i=0; i<E; i++) {
				s = br.readLine().split(" ");
				int start = Integer.parseInt(s[0]);
				int end = Integer.parseInt(s[1]);
				A[start].add(end); //양방향으로 저장
				A[end].add(start);
			}
			//모든 노드에서 DFS 실행
			for(int i=1; i<=V; i++) {
				if(IsEven) {DFS(i);}
					else {break;}
			}
			
			if(IsEven) {System.out.println("YES");}
				else {System.out.println("NO");}
		}
		

	}

	private static void DFS(int start) {
		visited[start] = true; // 탐색 완료 체크
		
		// A[start]와 연결된 모든 노드를 탐색
		for(int i : A[start]) {
			if(!visited[i]) {
				// 바로 직전에 있는 노드와 구분 필요
				// 0, 1로 분리
				check[i] = (check[start] + 1) % 2;
				DFS(i);
			} else if(check[start]==check[i]) {
					IsEven = false;
			}
		}
	}
}