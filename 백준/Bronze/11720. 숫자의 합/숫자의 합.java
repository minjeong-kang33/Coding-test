import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 받은 숫자는 String형으로 받은 후 하나씩 쪼개어 char[]에 담음
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();

		int sum = 0;
		for (int i = 0; i < cNum.length; i++) {
			// cNum을 int형으로 바꾼 후 sum에 누적시킴
			sum += cNum[i] - '0';
		}

		System.out.print(sum);
	}
}