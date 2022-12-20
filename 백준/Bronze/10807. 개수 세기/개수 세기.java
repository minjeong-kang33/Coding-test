import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] Array = new int[N];
		for (int i = 0; i < N; i++) {
			Array[i] = sc.nextInt();
		}

		int V = sc.nextInt();
		sc.close();

		int count = 0;
		for (int j = 0; j < Array.length; j++) {
			if (V == Array[j]) {
				count++;
			}
		}
		System.out.println(count);
	}
}