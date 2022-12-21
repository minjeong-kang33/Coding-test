import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];

		int max = -1000000;
		int min = 1000000;
		for (int i = 0; i < N; i++) {
			int M = sc.nextInt();
			array[i] = M;
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println(min + " " + max);
	}
}