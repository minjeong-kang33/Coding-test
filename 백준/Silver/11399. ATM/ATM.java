import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// 수행시간이 적은 순서대로 진행되어야 하므로 정렬
		Arrays.sort(arr);
		
		int sum = 0; // 전원의 총 대기시간
		int add = 0; // 한 명의 수행시간
		
		for (int i = 0; i < n; i++) {
			// 앞 사람의 수행시간과 대기시간이 누적되어야 하므로
			add += arr[i];
			sum += add;
		}
		System.out.print(sum);
	}
}