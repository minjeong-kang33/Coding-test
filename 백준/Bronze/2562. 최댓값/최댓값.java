import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = 0;
		int index = 0;
		for (int i = 1; i <= 9; i++) {
			int n = scanner.nextInt();
			if (n > num) {
				num = n;
				index = i;
			}
		}
        scanner.close();
		System.out.println(num);
		System.out.println(index);

	}
}