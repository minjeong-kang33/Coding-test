import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// 받을 수 있는 N의 범위가 50만 이하이므로
        // 제곱할 경우 int의 범위를 벗어나므로
		Long N = Long.parseLong(br.readLine());
		
        // 이중 for문이므로 시간 복잡도는 O(n^2), 차수는 2가 됨
		System.out.println(N*N);
		System.out.println('2');
        
	}
}