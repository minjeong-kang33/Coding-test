import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int winner = 1; // 우승자: 초기값 = 첫 번째 사람
		int winner_score = 0; // 우승자의 점수

		for (int i = 1; i <= 5; i++) {
			st = new StringTokenizer(br.readLine());
			int score = 0; // 한 참가자의 점수의 합

			// token이 계속 주어지는 한, 값들을 합산
			while (st.hasMoreTokens()) {
				score += Integer.parseInt(st.nextToken());
			}
			
			// 위에서 합산한 값이 우승자의 점수보다 높을 경우
			// 우승장의 번호와 해당 점수를 저장
			if(score > winner_score) {
				winner = i;
				winner_score = score;
			}
		}
		
		System.out.println(winner+" "+winner_score);
	}
}