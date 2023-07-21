import java.util.Scanner;

public class Main {
	static int[] parent;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 데이터의 개수 = N+1개
		int M = sc.nextInt(); // 질의의 개수

		// 대표노드 초기화
		parent = new int[N + 1];
		for (int i = 0; i < N + 1; i++) {
			parent[i] = i;
		}

		// 질의 받음
		for (int i = 0; i < M; i++) {
			int question = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (question == 0) { // union 연산
				union(a, b);
			} else { // find 연산
				boolean result = checkSame(a, b);
				if(result) {System.out.println("YES");}
				else {System.out.println("NO");}
			}
		}
	}

	private static void union(int a, int b) {
		// 대표 노드 찾아서 연결
		a = find(a);
		b = find(b);

		if (a != b) {
			parent[b] = a; // 연결
		}
	}

	private static int find(int a) {
		if (a == parent[a]) {
			return a;
		} else {
			// a의 대표 노드값을 find(parent[a])로 저장 (재귀함수)
			return parent[a] = find(parent[a]);
		}
	}

	private static boolean checkSame(int a, int b) {
		a = find(a);
		b = find(b);

		if (a == b) { return true;} 
			else { return false;}

	}
}