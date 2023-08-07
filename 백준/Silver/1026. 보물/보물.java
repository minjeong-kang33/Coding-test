import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Integer[] B = new Integer[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A); // 오름차순 정렬
        Arrays.sort(B, Collections.reverseOrder()); // 내림차순 정렬

        int sum = 0;
        for (int i = 0; i < N; i++) {
            // A의 최솟값과 B의 최댓값을 곱해서 가장 작은 sum을 만들어냄 
            sum += (A[i] * B[i]);
        }
        System.out.println(sum);
    }
}