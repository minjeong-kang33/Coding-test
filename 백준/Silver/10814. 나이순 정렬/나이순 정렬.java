import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][2];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken(); // 나이
			arr[i][1] = st.nextToken(); // 이름
		}

		Arrays.sort(arr, new Comparator<String[]>() {
			// 나이순으로 정렬
			@Override
			public int compare(String[] s1, String[] s2) {
				// [0]번째 요소인 나이를 int형으로 변환 후 비교
				// s1의 나이가 s2의 나이보다 클 경우에만 순서를 변경하므로
				// 최종적으로는 나이를 오름차순으로 정렬한 결과가 출력됨
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}

		});

		for (int i = 0; i < N; i++)
			System.out.println(arr[i][0] + " " + arr[i][1]);
	}
}