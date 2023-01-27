import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// a부터 z까지의 모든 알파벳이 들어가는 배열 생성
		int[] arr = new int[26];

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		// ASCII에서 'A'=65,'Z'=90 / 'a'=97,'z'=122
		for (int i = 0; i < str.length(); i++) {
			// 받은 문자열 str을 .charAt으로 하나씩 쪼개고
			// i번째, 즉 0부터 str의 길이-1만큼의 수를 ASCII코드화 했을 때

			// 대문자 범위인 경우 해당하는 순서의 arr배열의 값을 1씩 증가시킴
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				// ex) str이 A로 시작하는(i=0일때) 문자열일 경우
				// str.charAt(0)은 'A'이고, 거기서 'A'를 뺌으로써
				// arr의 첫 번째 순서인 0번째의 0값이 1로 증가한다.
				arr[str.charAt(i) - 'A']++;
			}
			// 소문자 범위인 경우
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				arr[str.charAt(i) - 'a']++;
			}

		}
		// 최대값만을 출력해야하므로 기본값 0보다 작은 -1을 초기값으로 설정
		int max = 0;
		char answer = 0;

		for (int i = 0; i < arr.length; i++) {
			// 배열 내 값이 max보다 클 경우
			// 해당 순서에 +65를 해서 대문자로 변경 후 출력
			if (max < arr[i]) {
				max = arr[i];
				answer = (char) (i + 65);
			} else if (max == arr[i]) {
				// 반복문 전개 중 앞에서 받아온 max값과 현재 비교할
				// arr[i]값과 같은경우 '?' 출력
				answer = '?';
			}
		}
		System.out.println(answer);

	}
}