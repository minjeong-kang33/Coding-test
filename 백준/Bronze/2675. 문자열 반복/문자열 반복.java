import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		//테스트 케이스T만큼 반복할 숫자R과 문자열S를 입력하도록 for문
		for(int i=1; i<=T; i++) {
			int R = in.nextInt();
			String S = in.next();
			//.split("")을 사용하여 받은 문자열S를 하나씩 쪼개어 str 배열에 담음
			String[] str = S.split("");
			//str배열을 출력하므로 초기값0, 최대값 str.length-1로서 반복문 전개
			for(int j=0; j<str.length; j++) {
				//이중 for문으로 각각의 문자를 R만큼 반복하여 출력
				for(int l=0; l<R; l++) {
					System.out.print(str[j]);
				}
			}System.out.println();
			
		}in.close();
		
	}
}
