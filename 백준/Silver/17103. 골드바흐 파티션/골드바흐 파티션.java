import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] check = new boolean[1000001];
		check[0] = true; // true = 소수가 아님
		check[1] = true;

		for (int i = 2; i <= Math.sqrt(2 * 1000000); i++) {
			if (check[i]) { // 이미 소수가 아님을 안다면 건너뜀
				continue;
			}
			for (int j = i + i; j < 1000001; j += i) {
				// 소수가 아닌 숫자의 배수도 소수가 아니므로 true 처리
				check[j] = true;
			}
		}

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int count = 0;
			int temp = sc.nextInt();
			for (int j = 2; j <= temp / 2; j++) {
				if (!check[j] && !check[temp - j]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}