import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long n = Long.parseLong(br.readLine());
		
		System.out.println((n * (n - 1) * (n - 2)) / 6);
		// 3중 for문이므로 n^3번 실행됨
		System.out.println(3);
	}
}