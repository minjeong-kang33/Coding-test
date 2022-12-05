import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		in.close();

		int D = B + C;
		int E = D / 60;

		if (E >= 1) {
			A += E;
			D = D % 60;
		}
		if (A >= 24) {
			A -= 24;
		}
		System.out.println(A + " " + D);
	}
}