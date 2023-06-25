import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());

		// A, B의 최대공약수를 먼저 구한 뒤, A*B에 최대공약수를 나눔
		long answer = a * b / gcd(a, b);
		System.out.println(answer);

	}

	// 유클리드 호제법 사용
	public static long gcd(long a, long b) {
		while (b != 0) {
			// 최소 공배수를 구하기 위해 a에서 b를 나눈 나머지를 구함
			long r = a % b;

			// a에 b를, b에 나머지 r을 대입하여 다시 반복
			a = b;
			b = r;
		}
		return a;
	}
}