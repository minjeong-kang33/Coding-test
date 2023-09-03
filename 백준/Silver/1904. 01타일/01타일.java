import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*  N = 1 ) 1                                                      :1개
            N = 2 ) 00, 11                                                 :2개
            N = 3 ) 001, 111, 100                                          :3개
            N = 4 ) 0000, 1100, 0011, 1111, 1001                           :5개
            N = 5 ) 00001, 11001, 00111, 11111, 10011, 00100, 11100, 10000 :8개
            즉, N(i) = N(i-1) + N(i-2) */

        int[] arr = new int[1000001];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i < arr.length; i++) {
            arr[i] = -1;
        }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 3; i <= N; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 15746;
        }

        System.out.println(arr[N]);

    }


}