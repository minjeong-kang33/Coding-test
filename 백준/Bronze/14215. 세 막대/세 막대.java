import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 숫자를 3개 입력받아 바로 ArrayList에 담은 후
		// Collections.sort를 이용해 오름차순으로 나열함
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			int number = Integer.parseInt(st.nextToken());
			list.add(number);
		}
		Collections.sort(list);

		// 가장 짧은 두 변의 합 > 가장 긴 한 변의 길이일 경우 세 변의 둘레가,
		// 그렇지 않을 경우 가장 짧은 두 변의 합 *2 -1 이 세 변의 둘레가 됨
		if (list.get(0) + list.get(1) > list.get(2)) {
			System.out.println(list.get(0) + list.get(1) + list.get(2));
		} else {
			System.out.println((list.get(0) + list.get(1)) * 2 - 1);
		}
	}
}
