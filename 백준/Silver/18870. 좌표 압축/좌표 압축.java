import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// 받은 모든 숫자 중 각 숫자보다 작은 숫자의 개수를 구하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		String[] input = br.readLine().split(" ");
		int[] nums = new int[N];
		for (int i = 0; i < N; i++)
			// 받은 수를 배열에 저장
			nums[i] = Integer.parseInt(input[i]);

		// 정렬된 배열과 기존 배열 모두 필요하므로 clone으로 배열을 복사해둠
		int[] copyNums = nums.clone();
		Arrays.sort(nums);

		Map<Integer, Integer> hmap = new HashMap<>();
		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (!hmap.containsKey(nums[i]))
				// 정렬이 된 배열을 기준으로 순서대로 훑으며 cnt를 증가시킴
				// 즉, -10에서 cnt=0, -9에서 cnt=1, 2에서 cnt=2, 4에서 cnt=3이 됨
				hmap.put(nums[i], cnt++);
		}

		for (int i = 0; i < N; i++) {
			// 출력은 처음에 입력받은 순서대로 출력하므로 미리 복사해둔 배열을 사용
			// 해당 값과 일치하는 cnt값을 출력함
			sb.append(hmap.get(copyNums[i])).append(" ");
		}

		System.out.println(sb.toString());

	}
}
