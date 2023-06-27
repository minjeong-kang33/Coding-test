import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st1.nextToken()); // 분자1
		int b = Integer.parseInt(st1.nextToken()); // 분모1
		int a2 = Integer.parseInt(st2.nextToken()); // 분자2
		int b2 = Integer.parseInt(st2.nextToken()); // 분모2

		// 분수의 합을 기본 공식
		// 분자 = 분자1*분모2 + 분자2*분모1
		// 분모 = 분모1*분모2
		int c = a * b2 + b * a2;
		int d = b * b2;

		// 구한 분자, 분모의 최소 공약수를 구하여 분자, 분모를 나눔
		int gcd = gcd(c, d);
		System.out.println(c / gcd + " " + d / gcd);
	}

	// 유클리드 호제법으로 최소 공약수를 구함
	public static int gcd(int c, int d) {
		while (d != 0) {
			int r = c % d;
			c = d;
			d = r;
		}
		return c;
	}
}