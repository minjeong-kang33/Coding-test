import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// N=4 -> 4/4 = 1 => long = 1개 + int
		// N=8 -> 8/4 = 2 => long = 2개 + int
		for(int i=1; i<=N/4; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
		
	}

}