import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min_x = 10000, max_x = -10000;
		int min_y = 10000, max_y = -10000;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			min_x = Math.min(min_x, x);
			max_x = Math.max(max_x, x);
			min_y = Math.min(min_y, y);
			max_y = Math.max(max_y, y);
		}

		sc.close();
		System.out.println((max_x - min_x) * (max_y - min_y));

	}

}