import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuffer bf = new StringBuffer();
		int N = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		Stack<Integer> stack = new Stack<Integer>();
		int num = 1; // 1부터 시작
		boolean result = true; // 검증결과 저장

		for (int i = 0; i < arr.length; i++) {
			// a가 num보다 크면 스택에 num부터 a까지의 값을 추가
			// 추가한 기록으로서 +를 출력
			if (arr[i] >= num) {
				while (arr[i] >= num) {
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			} else {
				// a가 num보다 작아지면 스택에서 값을 꺼내어 n에 저장
				int n = stack.pop();
				// n이 arr[i]보다 크면 수열이 올바르지 않으므로 NO 출력 후 반복문 종료
				if (n > arr[i]) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}
		}

		// 모든 반복문이 끝난 후 가능한 경우(result가 ture)일 때만
		// bf에 저장해두었던 값들을 출력
		if (result) {
			System.out.println(bf.toString());
		}

	}
}