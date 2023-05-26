import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 홀수 그룹: 분자-- 분모++
		// 짝수 그룹: 분자++ 분모--
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N개의 바구니
		int M = sc.nextInt(); // 회전할 횟수

		int[] basket = new int[N]; // 바구니 배열
		for (int i = 0; i < basket.length; i++) {
			basket[i] = i + 1;
		}

		int[] newBasket = new int[N]; // 회전한 바구니 배열

		for (int r = 0; r < M; r++) {
			int i = sc.nextInt() - 1; // 시작
				int i2 = i;
			int j = sc.nextInt() - 1; // 끝
			int k = sc.nextInt() - 1; // 기준

			for (int p = 0; p < j - i + 1; p++) {
				// 기준에서 + 반복 횟수한 값이 끝 바구니의 인덱스보다 작을 때만
				// k부터 j까지의 값을 넣음
				if (k + p <= j) {
					newBasket[p + i] = basket[k + p];
				// 그렇지 않을 경우 i에서 k까지 값을 넣음
				} else { 
					newBasket[p + i] = basket[i2];
					// i2값을 계속 증가시켜서 i~k부분을 j뒤에 넣어줌
					i2++; 
				}
			}
			for (int p = 0; p < N; p++) {
				// newBasket[p]=0: 회전하는 값에 포함되지 않음 -> 0을 제외한 부분을 덮어씌움
				if (newBasket[p] != 0) { 
					basket[p] = newBasket[p];
				}
			}

		}
		for (int i = 0; i < N; i++) {
			System.out.print(basket[i] + " ");
		}

	}

}