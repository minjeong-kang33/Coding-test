import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		// 평균을 구하기 위해 값을 먼저 sum에 누적하면서 저장해두고
		// 그 후에 배열에 숫자를 담음
		int[] numArr = new int[5];
		for (int i = 0; i < 5; i++) {
			int num = in.nextInt();
			sum += num;
			numArr[i] = num;
		}
		System.out.println(sum / 5);
		// 배열 정렬
		Arrays.sort(numArr);
		// 배열을 중앙값 = 배열길이/2
		System.out.println(numArr[numArr.length / 2]);
	}

}
