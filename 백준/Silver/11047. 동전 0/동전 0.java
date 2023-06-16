import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); // 화폐의 종류
		int K = Integer.parseInt(st.nextToken()); // 만들어야하는 금액

		int[] money = new int[N];
		for (int i = 0; i < N; i++) {
			// 화폐 단위를 입력받음
			money[i] = Integer.parseInt(br.readLine());
		}

		int answer = 0;
		// 큰 돈부터 거슬러 내려감
		for (int i = N - 1; i >= 0; i--) {
			// 화폐가 구하고자 하는 금액보다 작거나 같을 경우에만 사용 가능함
			if (money[i] <= K) {
				// 사용하는 화폐의 갯수를 count 변수에 더해두고
				// 구하고자 하는 금액은 해당 화폐의 금액만큼 뺀 후, 다음으로 큰 화폐로 돌아가 반복하여 검토
				answer += (K / money[i]);
				K = K % money[i];
			}
		}
		
		System.out.println(answer);
	}
}