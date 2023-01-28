import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문자열 앞 뒤의 공백을 제거하는 .trim() 함수
		String str = sc.nextLine().trim();
		if (str.length() == 0) {
            // 입력이 없을 경우
			System.out.println("0");
		} else {
			// 문자열 사이의 공백을 기준으로 문자를 나누는 .split()함수
			System.out.println(str.split(" ").length);
		}

	}
}