import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(); // 시작
		int N = sc.nextInt(); // 끝
		
		int[] arr = new int[N+1];
		for(int i=2; i<=N; i++) {
			arr[i] = i;
		}
		
		// 1을 제외하고, 2부터 N의 제곱근까지만 반복
		for(int i=2; i<=Math.sqrt(N); i++) {
			// 값이 소수일 경우 반복문 종료
			if(arr[i]==0) {continue;}
			// 소수가 아닐경우, i의 배수인 j를 사용해서 탐색하고 값 변경
			for(int j=i+i; j<=N; j=j+i) {
				arr[j] = 0;
			}
		}
		for(int i=M; i<=N; i++) {
			// 소수인 수만 출력
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}
	}
}