import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 도시의 개수
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 도시 사이의 거리
		long[] distance = new long[N - 1];
		for (int i = 0; i < N - 1; i++) {
			distance[i] = Long.parseLong(st.nextToken());
		}

		// 각 도시의 기름 가격
		long[] price = new long[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			price[i] = Long.parseLong(st.nextToken());
		}

		long sum = 0;
		long min = price[0]; // 최소 주유비. 초기값은 첫번째 도시 기준

		for (int i = 0; i < distance.length; i++) {
			// 모든 도시의 주유비용을 확인하며 이전 도시보다 저렴할 경우
			// 그 값을 기준으로 거리만큼 주유.
			if (price[i] < min) {
				min = price[i];
			}
			sum += (min * distance[i]);
		}

		System.out.println(sum);
	}
}
