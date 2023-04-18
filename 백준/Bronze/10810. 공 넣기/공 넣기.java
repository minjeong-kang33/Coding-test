import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   //바구니 개수
        int[] arr = new int[N]; //바구니의 개수만큼 공을 담아야하므로 배열 선언
        int M = sc.nextInt();   //공을 넣는 횟수

        for(int i = 0; i < M; i++) {
            int I = sc.nextInt(); // I번 바구니부터
            int J = sc.nextInt(); // J번 바구니까지
            int K = sc.nextInt(); // K번 번호가 적힌 공을 넣음

            for(int j = I - 1; j < J; j++) {
                // 첫 번째 바구니는 비어있으므로 I-1부터 시작
                arr[j] = K;
            }
        }
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}