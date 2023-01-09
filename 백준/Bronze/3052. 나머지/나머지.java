import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			// 10개의 값을 받음과 동시에 42로 나눈 나머지를 배열에 저장
			array[i] = in.nextInt() % 42;
		}

		int count = 1;
		// 배열 값을 정렬하여 순서대로 비교할 수 있게 한다
		Arrays.sort(array);

		for (int j = 0; j < array.length - 1; j++) {
			// 배열값에 있어서 앞과 뒤의 숫자가 다를 경우 count가 증가하도록 한다
			if (array[j] != array[j + 1]) {
				count++;
			}
		}
		System.out.println(count);

	}

}
