import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();

		for(int i=1; i<=A; i++) {
			int C = in.nextInt();
			if(C<B) {System.out.println(C);}
		}

	}
}