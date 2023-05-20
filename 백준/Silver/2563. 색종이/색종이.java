import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[100][100]; // 100=도화지의 크기

		int answer = 0;
		for (int i = 0; i < N; i++) {
			int X = sc.nextInt(); // 색종이의 왼쪽변과 도화지의 왼쪽변 사이의 거리
			int Y = sc.nextInt(); // 색종이의 아래쪽변과 도화지의 아래쪽변 사이의 거리

			for (int j = X; j < X + 10; j++) { // 10=색종이의 크기
				for (int k = Y; k < Y + 10; k++) {
					arr[j][k] = 1;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) { // x좌표
			for (int j = 0; j < arr.length; j++) { // y좌표
				if (arr[i][j] == 1) {
					answer++;
				}
			}
		}
		sc.close();
		System.out.println(answer);
	}
}