import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Long n = Long.parseLong(br.readLine());
		
		// N이 5일 때, 첫 번째 for문은 1~4까지 반복
		// 두 번째 for문은 i가 1일 때 2~5까지 4번
		//              i가 2일 때 3~5까지 3번
		//              ...이므로 총 10번을 수행함
		System.out.println(n * (n - 1) / 2);
		System.out.println("2");
	}
}