import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 0부터 9까지의 수(배열의 순서상)가 담긴 arr배열
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		// 숫자 3개를 받자마자 곱하여 num에 담고 String형으로 변환
		int num = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String str = Integer.toString(num);

		for (int i = 0; i < 10; i++) {
			// 개수를 뜻하는 변수 count
			int count = 0;
			// str의 길이만큼 모든 요소를 검사
			// 해당 인덱스의 문자와 i가 같은 수가 몇개 있는지 확인
			// 같을 경우 count를 1씩 증가시키면 개수를 카운트
			for (int j = 0; j < str.length(); j++) {
				// 문자에서 -48을 하면 숫자로 변환됨
				if ((str.charAt(j) - 48) == i) {
					count++;
				}
			}
			System.out.println(count);
		}

	}
}