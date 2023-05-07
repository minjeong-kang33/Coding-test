import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N개의 카드
		int M = sc.nextInt(); // 넘으면 안되는 수
		int max = 0; // 최근 계산한 합

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt(); // 카드에 적힌 수
		}

		// 첫번째 카드: 뒤쪽의 2개 카드를 둔 채로 순회하므로
		for (int i = 0; i < N - 2; i++) {
			// 두번째 카드: 첫번째 카드 다음부터 뒤쪽의 1개 카드를 둔 채로 순회
			for (int j = i + 1; j < N - 1; j++) {
				// 세번째 카드: 두번째 카드 다음부터 마지막까지 순회
				for (int k = j + 1; k < N; k++) {
					int sum = arr[i] + arr[j] + arr[k]; // 3개 카드의 합
					// 세 카드의 합이 M보다 작을 경우 합과 max 비교 후 큰 수를 담음
					if (sum <= M) {
						max = Math.max(max, sum);
					}
				}
			}
		}
		System.out.println(max);
	}

}