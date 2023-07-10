import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		// 버블 정렬
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < N - 1 - i; j++) {
				// 앞의 값이 뒤의 값보다 클 경우 둘의 위치를 바꿈
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}

	}

}