import java.io.*;
import java.util.Scanner;

public class Main {
	// 체스판의 색깔은 두 가지밖에 없으므로 boolean형태로 배열 선언
	static boolean[][] arr;
	static int min = 64;

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		int m = in.nextInt();
		in.nextLine(); // 개행 문자 읽기

		arr = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String str = in.nextLine();
			for (int j = 0; j < m; j++) {
				// 흰색일 경우 true, 검은색일 경우 false로 취급
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}

		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				// 탐색할 체스판의 시작점을 나타내는 i, j를 가지고 check 함수 실행
				check(i, j);
			}
		}

		System.out.println(min);
		in.close();
	}

	static void check(int x, int y) {
		int cnt = 0;
		// 현재 위치의 색깔. 초기값은 시작점의 색깔
		boolean color = arr[x][y];

		// 받은 시작점 값에 +8을 하여 체스판이 끝나는 위치를 계산
		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {
				// 현재위치와 color 값이 다르면 색을 변경해야하므로
				if (arr[i][j] != color) {
					cnt++;
				}
				// color값을 반전시킴
				color = !color;
			}
			// 행이 바뀌므로 다시 color값을 반전시킴
			color = !color;
		}
		// 색상 변경 횟수 cnt와 전체 칸수 -cnt 값을 비교해 더 작은 수를 사용
		// 체스판은 흰, 검이 번갈아가며 나오므로 한 번의 색상 변경으로도 해당 부분을 완성할 수 있기때문
		cnt = Math.min(cnt, 64 - cnt);

		// cnt와 min값을 비교하여 최소값을 사용
		// 전체 체스판에서의 최소 변경 횟수를 알 수 있음
		min = Math.min(cnt, min);
	}

}
