import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double total_score = 0; // 총학점
		double final_credit = 0; // 학점 * 과목평점

		for (int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			String subject = st.nextToken(); // 과목명
			double score = Double.parseDouble(st.nextToken()); // 학점
			String credit = st.nextToken(); // 평점

			// Pass 과목은 계산에서 제외
			if (!credit.equals("P")) {
				total_score += score;
			}

			if (credit.equals("A+")) {
				final_credit += score * 4.5;
			} else if (credit.equals("A0")) {
				final_credit += score * 4.0;
			} else if (credit.equals("B+")) {
				final_credit += score * 3.5;
			} else if (credit.equals("B0")) {
				final_credit += score * 3.0;
			} else if (credit.equals("C+")) {
				final_credit += score * 2.5;
			} else if (credit.equals("C0")) {
				final_credit += score * 2.0;
			} else if (credit.equals("D+")) {
				final_credit += score * 1.5;
			} else if (credit.equals("D0")) {
				final_credit += score * 1.0;
			}
		}
		// 전공평점 = (학점*과목평점) / 총학점
		System.out.println(final_credit / total_score);
	}
}