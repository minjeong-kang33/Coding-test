import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N개의 숫자
		int M = sc.nextInt(); // M번의 계산

		// 합배열 sum[]에 첫 번째 숫자부터 받은 숫자까지의 누적합을 구하여 저장함
		int[] sum = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			sum[i] = sum[i - 1] + sc.nextInt();
		}

		for (int i = 1; i <= M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			// start ~ end까지의 구간합 구하기
			// = sum[end](첫 숫자 ~ end까지의 누적합)에서 sum[start-1](첫 숫자 ~ start 바로 앞 숫자까지의 누적합)을
			// 빼야함
			System.out.println(sum[end] - sum[start - 1]);
		}

		sc.close();

	}
}
