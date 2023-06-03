import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		// n이 4거나 7이면 봉지의 수는 -1
		if (n == 4 || n == 7) {
			System.out.println("-1");
			// n%5가 0이면 봉지의 수는 (n/5)
		} else if (n % 5 == 0) {
			System.out.println(n / 5);
			// n%5가 1거나 3이면 봉지의 수는 (n/5)+1
		} else if (n % 5 == 1 || n % 5 == 3) {
			System.out.println((n / 5) + 1);
			// n%5가 2거나 4면 봉지의 수는 (n/5)+2
		} else if (n % 5 == 2 || n % 5 == 4) {
			System.out.println((n / 5) + 2);
		}
	}

}