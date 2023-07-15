import java.util.Scanner;

public class Main {
	public static int[] stack;
	public static int size = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int N = sc.nextInt();
		stack = new int[N];

		for (int i = 0; i < N; i++) {
			String str = sc.next();

			switch (str) {
			case "push":
				push(sc.nextInt());
				break;

			case "pop":
				sb.append(pop()).append('\n');
				break;

			case "size":
				sb.append(size()).append('\n');
				break;

			case "empty":
				sb.append(empty()).append('\n');
				break;

			case "top":
				sb.append(top()).append('\n');
				break;
			}
		}
		sc.close();
		System.out.println(sb);
	}

	private static void push(int num) {
		// 현재 stack[]의 빈 자리인 size에 num을 담고
		// 다음에 받을 값을 위해 size를 늘려둠
		// 배열이기 때문에 stack[0:초기값]에 첫번째 값이 담겨있지만,
		// 메서드가 종료되면 size는 1이 되어있어 size를 출력하면 안에 담긴 값은 1개라는 것을 알 수 있음
		stack[size] = num;
		size++;
	}

	private static int pop() {
		if (size == 0) {
			return -1;
		} else {
			// stack에 담긴 가장 마지막 값(인덱스 0이 있으므로 -1)을 임시 변수 temp에 담고
			// 해당 자리에 0을 넣어 값을 무효화하고 size를 감소시킴
			int temp = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return temp;
		}
	}

	private static int size() {
		return size;
	}

	private static int top() {
		if (size == 0) {
			return -1;
		} else {
			// stack에 담긴 가장 마지막 값(인덱스 0이 있으므로 -1)을 출력
			return stack[size - 1];
		}
	}

	private static int empty() {
		if (size == 0) {
			return 1;
		} else {
			return 0;
		}
	}

}