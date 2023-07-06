import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 1; i <= N; i++) {
			// 1번 카드부터 담음
			queue.add(i);
		}

		while (queue.size() > 1) {
			// 제일 위의 한 장을 버림
			queue.poll();
			// 그 다음 윗 카드를 제일 아래로 옮김
			int temp = queue.poll();
			queue.add(temp);
		}

		// 한 장만 남은 마지막 카드를 출력
		System.out.println(queue.poll());
	}
}