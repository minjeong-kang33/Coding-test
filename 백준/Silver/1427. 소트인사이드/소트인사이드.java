import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		sc.close();
		
		// String 형으로 받은 숫자를 char 타입 배열에 담아 정렬
		char[] num = n.toCharArray();
		Arrays.sort(num);
		
		// 정렬한 배열을 역순으로 출력 = 내림차순
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i]);
		}

	}

}