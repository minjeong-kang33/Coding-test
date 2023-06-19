import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = Integer.MAX_VALUE; // 초기 상태 여부 확인을 위한 값으로 설정
		// 최소값 만들기 => 덧셈을 먼저 실행
		// => -를 기준으로 문자열을 분리
		String[] minus_split = br.readLine().split("-");

		for (int i = 0; i < minus_split.length; i++) {
			int temp = 0;

			// -를 기준으로 분리된 문자열을
			// +를 기준으로 문자열을 다시 분리
			String[] plus_split = minus_split[i].split("\\+");

			// +로 분리된 문자열을 모두 더함
			for (int j = 0; j < plus_split.length; j++) {
				temp += Integer.parseInt(plus_split[j]);
			}

			// 첫 번째 숫자일 경우 temp값이 첫 번째 수가 됨
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				// 남은 숫자를 뺌
				sum -= temp;
			}
		}
		System.out.println(sum);
	}

}