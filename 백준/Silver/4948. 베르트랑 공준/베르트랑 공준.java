import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 받을 수 있는 N의 최댓수의 제곱개만큼 배열을 선언하고 초기화
		int N = 123456;
		boolean[] check = new boolean[2 * N + 1];
		for (int i = 2; i <= 2 * N; i++) {
			check[i] = true;
		}
		
		// 2부터 N의 제곱근까지 탐색하며 소수 판별
		// 소수일 경우 false로 설정
		// N이 10일경우 실행되는 i는 2와 3. 이 때 2와 3의 배수는 모두 소수가 아니므로 false처리
		for (int i = 2; i <= Math.sqrt(2 * N); i++) {
			for (int j = i + i; j <= 2 * N; j += i) {
				check[j] = false;
			}
		}
		while (true) {
			int n = sc.nextInt();
			if (n == 0) { break; }
			int count = 0; // 소수의 개수
			// 입력받은 n보다 크고 2n보다 작거나 같은 숫자를 대상으로 탐색
			// 해당 숫자를 인덱스로 지닌 check배열의 값이 true이면 소수 개수를 증가시킴
			for (int i = n + 1; i <= 2 * n; i++) {
				if (check[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}