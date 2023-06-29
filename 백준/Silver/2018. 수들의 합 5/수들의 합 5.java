import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int count = 1; // 경우의 수
		int start_index = 1;
		int end_index = 1;
		int sum = 1;

		while (end_index != N) {
			if (sum == N) {
				// 모든 수를 더한 sum이 N과 같아졌을 경우
				// 완료했다는 뜻으로 경우의 수 count를 증가시킨 후 
				// end_index를 증가시켜두어 else if구문이 동작되도록 해야함
				count++;
				end_index++;
				sum += end_index;
			} else if (sum > N) {
				// sum이 구하려고 하는 수 N보다 클 경우
				// start_index를 증가(우측으로 이동)시켜 좌측의 수를 제거해야하므로
				// sum에서 start_index를 뺀 다음 start_index를 증가 시켜야함
				sum -= start_index;
				start_index++;
			} else {
				// 아직 sum이 N에 도달하지 못 한 경우
				// end_index를 증가(우측으로 이동)시켜 새롭게 end_index가 된 수도
				// sum에 더해줘야 함
				end_index++;
				sum += end_index;
			}
		}
		System.out.println(count);
	}
}
