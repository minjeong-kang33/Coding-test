import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// N개의 회의에 대해 각각의 시작, 종료시간을 담아야하므로 2차원 배열 사용
		int[][] time = new int[N][2];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			time[i][0] = Integer.parseInt(st.nextToken()); // 시작시간
			time[i][1] = Integer.parseInt(st.nextToken()); // 종료시간
		}

		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// 시간이 겹치지 않게 하기위해 종료시간을 기준으로 정렬해야함
				// 종료시간이 같을 경우 시작시간이 빠른순으로 정렬
				if (o1[1] == o2[1]) {
					// o1[0] - o2[0]의 결과가 음수일 경우 compare()의 특성상
					// 더 작은 수가 되는 o1[0]을 앞에 정렬시킨다.
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}

		});

		int count = 0;
		int prev_end_time = 0;

		for (int i = 0; i < N; i++) {
			// 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
			if (prev_end_time <= time[i][0]) {
				prev_end_time = time[i][1];
				count++;
			}
		}

		System.out.println(count);
	}

}