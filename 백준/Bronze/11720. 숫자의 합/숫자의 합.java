import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		sc.close();
		
		int answer = 0;
		for(int i=0; i<N; i++) {
			//charAt은 아스키코드로 변환하므로 -48/-'0'필요
			answer += str.charAt(i)-'0';
		}
		System.out.println(answer);
	}
}