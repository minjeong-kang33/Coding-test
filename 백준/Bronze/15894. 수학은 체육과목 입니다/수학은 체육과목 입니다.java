import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1 ≤ n ≤ 10^9 이므로
		long N = sc.nextLong();
		sc.close();
		
		// N=3일때, 도형의 둘레는 12이고
		// N=4일때, 도형의 둘레는 16이므로
		System.out.println(4*N);
	}
}