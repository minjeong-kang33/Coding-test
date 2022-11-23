import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		in.close();

		for (int m = 1; m <= 9; m++) {
			System.out.println(n + " * " + m + " = " + n * m);

		}

	}

}