import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int N = in.nextInt();
		
		int total =0;
		for (int i = 1; i <= N; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			total += (a*b);
		}

		if (X == total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		in.close();

	}
}