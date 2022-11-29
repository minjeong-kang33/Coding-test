import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		in.close();

		if (M < 45) {
			H--;
			M += 15;
			if (H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		} else {
			M = M - 45;
			System.out.println(H + " " + M);
		}

	}
}