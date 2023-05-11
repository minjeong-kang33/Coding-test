import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Scanner.hasNext: 입력값이 있으면 true, 없으면 false
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}