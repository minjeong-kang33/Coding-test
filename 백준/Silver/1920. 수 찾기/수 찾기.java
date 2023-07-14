import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 정렬할 숫자의 개수
		
		// N개만큼 표본 숫자를 받아 배열에 담아서 정렬
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);

		int M = sc.nextInt(); // 탐색할 숫자의 개수
		for (int i = 0; i < M; i++) {
			// M개만큼 숫자를 받아 이진탐색 실행
			boolean find = false;
			int target = sc.nextInt();
			
			// 초기 시작점은 0, 초기 종료점은 N-1 (인덱스 0이 있으므로)
			int start = 0;
			int end = A.length - 1;
			// 시작점과 종료점이 작거나 같을때 계속 반복하여 실행
			while (start <= end) {
				// 초기 중간값은 시작점과 종료점의 한 중간으로 설정
				int mid_index = (start + end) / 2;
				int mid_value = A[mid_index];
				
				// 중간값이 타겟보다 클 경우 종료점을 중간값보다 한 칸 앞으로 이동시켜 재탐색
				// 타겟보다 클 경우 시작점을 중간값보다 한 칸 뒤로 이동시켜 재탐색
				if (mid_value > target) {
					end = mid_index - 1;
				} else if (mid_value < target) {
					start = mid_index + 1;
				} else {
					find = true;
					break;
				}
			}
			
			if(find) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}

}