import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int first_abs = Math.abs(o1);
				int second_abs = Math.abs(o2);

				// 절대값이 같을 때, o1이 o2보다 크면 1을 아니면 -1을 출력
				if (first_abs == second_abs) {
					return o1 > o2 ? 1 : -1;
				}
				// 기본적으로 절대값이 작은 데이터를 우선
				return first_abs - second_abs;
			}
		});

		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			// 받은 값이 0일 때
			if (x == 0) {
				// 큐가 비어있으면 0 출력
				if (queue.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(queue.poll());
				}
				// 받은 값이 0이 아닌 경우
			} else {
				queue.add(x);
			}
		}
	}

}