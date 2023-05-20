import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			int arr[] = new int[26];

			// 받은 문자열의 i번째 알파벳을 0부터 시작하는 숫자(인덱스)로 변환
			int ch = str.charAt(0) - 'a';
			// i번째 알파벳을 확인하면 해당 배열 arr[]을 1로 변환
			arr[ch]++;
			boolean result = true;

			for (int j = 1; j < str.length(); j++) {
				ch = str.charAt(j) - 'a';
				// 문자열의 연속하는 j-1번째와 j번째 알파벳이 다를경우
				if (str.charAt(j - 1) != str.charAt(j)) {
					arr[ch]++;
					// 이전에 나왔던 알파벳이 떨어져서 다시 나타난 경우 != 그룹단어 이므로 result를 false로 변경
					if (arr[ch] == 2) {
						result = false;
						break;
					}
				}
			}
			// result가 true일 경우에만 그룹단어로서 카운트
			if (result) {
				answer++;
			}
		}
		sc.close();
		System.out.println(answer);
	}
}