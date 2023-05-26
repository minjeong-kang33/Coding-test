import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();

		// 역순으로 정렬할 것이므로 Integer 형 사용
		Integer[] score = new Integer[N];
		for (int i = 0; i < N; i++) {
			// 응시자의 점수
			score[i] = sc.nextInt();
		}

		Arrays.sort(score, Collections.reverseOrder());

		sc.close();
		System.out.println(score[k - 1]);
	}
}