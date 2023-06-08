import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] letters = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		for (int i = 0; i < letters.length; i++) {
			// 받은 문자열이 letters[] 배열에 있는 값을 포함하는지 검사
			// 포함하면 임의로 a라는 하나의 문자로 변환시킴
			if (str.contains(letters[i])) {
				str = str.replace(letters[i], "a");
			}
		}
		
		sc.close();
		// 문자가 몇 개 남았는지 카운트
		System.out.println(str.length());

	}

}