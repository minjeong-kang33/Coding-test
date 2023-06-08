import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, (e1, e2) -> {
			// 첫 번째 열 값이 같을 경우, 두 번째 열 값을 기준으로 오름차순 정렬
			if (e1[0] == e2[0]) {
				// 두 번째 열 값의 차이가 음수라면 e1은 e2보다 앞에 위치, 양수라면 e1은 e2보다 뒤에 위치
				return e1[1] - e2[1];
			// 첫 번째 열 값이 다를 경우, 첫 번째 열 값을 기준으로 오름차순 정렬
			} else {
				// 첫 번째 열 값의 차이가 음수라면 e1은 e2보다 앞에 위치, 양수라면 e1은 e2보다 뒤에 위치
				return e1[0] - e2[0];
			}
		});

		for (int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}

}