import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			// 입력값이 0 0 0이 주어질 때까지 반복
			if (a == 0 && b == 0 && c == 0) {
				break;
			}

			// 삼각형의 조건을 만족하지 않는 경우
			int max = Math.max(Math.max(a, b), c);
			if (a == max) {
				if (a >= b + c) {
					System.out.println("Invalid");
					continue;	
				}
			}
			if (b == max) {
				if (b >= a + c) {
					System.out.println("Invalid");
					continue;
				}
			}
			if (c == max) {
				if (c >= a + b) {
					System.out.println("Invalid");
					continue;
				}
			}

			// 세 변의 길이가 모두 다른 경우
			if (a != b && b != c && a != c) {
				System.out.println("Scalene");
				continue;
			}
			// 세 변의 길이가 모두 같은 경우
			if (a == b && b == c) {
				System.out.println("Equilateral");
				continue;
			}
			// 두 변의 길이만 같은 경우
			if ((a == b && a != c) || (b == c && b != a) || (a == c && a != b)) {
				System.out.println("Isosceles");
				continue;
			}

		}
	}
}
