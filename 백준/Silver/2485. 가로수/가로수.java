import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine()); // 심어져있는 가로수의 개수
		int[] tree = new int[N];

		for (int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(br.readLine());
		}

		int gcd = 0;
		for (int i = 0; i < N - 1; i++) {
			// 가로수 간의 간격을 구하여 gcd(초기값 0)와의 최대 공약수를 구함
			// 구한 최대공약수는 다시 gcd에 담아, 그 다음 가로수의 간격과 비교해 다시 최대 공약수를 구함
			int distance = tree[i + 1] - tree[i];
			gcd = gcd(distance, gcd);
		}
		// 첫 번째 가로수와 마지막 가로수의 간격을 구하여 최대 공약수로 나누면
		// 가로수가 심어져야 하는 간격을 알 수 있음
		// 이에 +1을 하면 전체 필요한 가로수의 수를 알 수 있고,
		// tree[] = 현재 있는 가로수의 숫자를 빼서 필요한 가로수의 개수를 알 수 있음
		System.out.println((tree[N - 1] - tree[0]) / gcd + 1 - (tree.length));
	}

	// 유클리드 호제법으로 최소 공약수를 구함
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}