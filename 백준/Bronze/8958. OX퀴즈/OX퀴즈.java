import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int i=0; i<T; i++) {
			String str = sc.next();
			//O의 개수 count, 점수의 합 score
			int count = 0;
			int score = 0;
			
			for(int j=0; j<str.length(); j++) {
				//str을 하나씩 쪼개어 O일 경우
				//count하고, 카운트 값을 증가시켜 다음 차례에서도 유지되도록 함
				//O의 개수(count)만큼 점수에 가산
				if(str.charAt(j)=='O') {
					count++;
					score+=count;
					//X일 경우 count값 초기화
				}else {
					count=0;
				}
			}System.out.println(score);
		}

	}
}