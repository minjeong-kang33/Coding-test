import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //기본 바구니
        int M = sc.nextInt(); //역순 바구니
        
		int[] arr = new int[N+1]; //바구니이름이 1부터 시작하므로 1개 더 생성
		//기본 바구니에 1부터 이름 붙이기
		for (int k = 1; k < arr.length; k++) {
			arr[k] = k;
		} 

		for (int k = 0; k < M; k++) {
			int i = sc.nextInt(); // i번부터
			int j = sc.nextInt(); // j번까지
			
			while(i < j){  // 앞뒤로 바꾸기
                int tmp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = tmp;
            }

		}
		// 1번 바구니부터 취급
		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}