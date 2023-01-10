import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int C = in.nextInt();
		
		for (int i = 0; i < C; i++) {
			int N = in.nextInt();
			int[] score = new int[N];
			int sum = 0;

			for (int j = 0; j < N; j++) {
				score[j] = in.nextInt();
				sum += score[j];
			}
			//count를 int로 정의할 경우 마지막에 비율을 구할때 
			//int/double이 되면서 에러가 발생하므로 둘다 double형으로 맞춰준다
			double avg = sum / N;
			double count = 0;

			for (int k = 0; k < N; k++) {
				if (score[k] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count / N) * 100);

		}

	}

}
