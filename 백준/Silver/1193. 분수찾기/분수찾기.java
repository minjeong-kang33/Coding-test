import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 홀수 그룹: 분자-- 분모++
		// 짝수 그룹: 분자++ 분모--
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int top = 1; // 분자
		int bot = 1; // 분모

		if (X == 1) {
			System.out.println("1/1");
		} else {
			// X가 몇 번째 그룹에 속하는지
			int n = 0;
			int cnt = 0;
			while (cnt < X) {
				n++;
				cnt = n * (n + 1) / 2;
			}
			// X가 그룹에서 몇 번째 수인지
			int num = X - (n - 1) * n / 2;

			// X가 짝수 행일때
			if (n % 2 == 0) {
				top = num;
				bot = n - num + 1;
			// 홀수 행일때
			} else {
				top = n - num + 1;
				bot = num;
			}
			System.out.println(top+"/"+bot);
		}

	}

}