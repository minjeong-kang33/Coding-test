import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// N번째 영화의 제목 = N번째로 작은 종말의 수
		// 1~6까지는 666, 1666, 2666,... 이지만
		// 7부터는 6660, 6661, ...이 되는 것에 주의
		int N = sc.nextInt();
		int number = 0;

		while (N > 0) {
			number++;
			String s = Integer.toString(number);

			// number를 계속 1씩 증가시키며
			// number, 즉 s에 666이 포함되었을 때만 N을 하나씩 감소시킴
			// 최종적으로 N이 0이 되었을 때 반복문을 종료시키고 number의 최종값을 출력함
			if (s.contains("666")) {
				N--;
			}
		}

		System.out.println(number);

	}

}