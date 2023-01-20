import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		// 알파벳 a~z까지 모두 담을 수 있는 배열 생성
		int[] arr = new int[26];
		// 문자열 S에 해당 알파벳이 없을 경우의 출력값인 -1을 초기값으로 함
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		// 문자열S를 하나씩 쪼개어 변수 ch에 담음
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);

			// ch-'a'으로 a=0이라 생각했을 때 몇 번째 알파벳인지 탐색
			// arr배열 해당 순서의 값이 -1(=초기값)일 때,
			// 즉 아직 변경되지않은 처음 나온 값이었을 경우에만
			// arr배열 내의 값을 변경. 이미 변경된 값이었을 경우에는 무시
			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}