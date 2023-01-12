import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		// 오차범위 때문에 int[]로 설정할 경우 형변환되면서 다른 결과가 나옴
		double[] scores = new double[N];

		for (int i = 0; i < scores.length; i++) {
			scores[i] = in.nextDouble();
		}

		Arrays.sort(scores);
		double sum = 0;

		for (int i = 0; i < scores.length; i++) {
			sum += (scores[i] / scores[scores.length - 1]) * 100;
		}
		System.out.println(sum / scores.length);

	}

}
