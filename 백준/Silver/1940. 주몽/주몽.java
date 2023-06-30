import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 가지고 있는 재료의 개수
		int M = sc.nextInt(); // 하나의 갑옷을 만드는데 필요한 재료의 개수(합)

		// 재료의 번호를 N개만큼 받아 오름차순으로 정렬
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		int count = 0;
		int start = 0; // start_index: 첫번째 숫자부터 시작
		int end = N-1; // end_index: 마지막 숫자부터 시작

		// 가장 큰수를 end_index로서 고정시킨 후, start_index를 조정하며 M을 만듦
		while (start < end) {
			// start와 end를 더해도 M보다 작은 경우 다음 start를 대입해 더 큰 합을 만들어 봄
			if (arr[start] + arr[end] < M) {
				start++;
			// start와 end를 더했는데 구하려는 M보다 큰 수일 경우 이전 end를 사용하여 더 작은 합을 만들어 봄
			} else if (arr[start] + arr[end] > M) {
				end--;
			// M을 구했을 경우, 정답인 count 수를 증가시킨 후,
			// 다음 start와 이전 end를 사용하여 다시 반복
			} else {
				count++;
				start++;
				end--;
			}
		}
		System.out.println(count);

	}
}
