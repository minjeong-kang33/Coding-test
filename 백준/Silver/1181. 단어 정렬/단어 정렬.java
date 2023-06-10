import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}

		Arrays.sort(arr, new Comparator<String>() {
			// 오버라이딩으로 Comparator에 있는 메서드인 compare를 재정의
			@Override
			public int compare(String s1, String s2) {
				// 길이가 같다면 사전 순으로 정렬
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				// 길이가 다르다면 오름차순으로 정렬
				} else {
					return s1.length() - s2.length();
				}

			}
		});

		System.out.println(arr[0]);
		for (int i = 1; i < N; i++) {
			// 이전 문자열과 비교 후 다를 경우에만 출력
			if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
	}
}