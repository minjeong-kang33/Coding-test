import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[][] apt = new int[15][15]; // 0층에서 14층, 1호에서 14호까지 존재
        for (int i = 0; i < 15; i++) {
            apt[0][i] = i; // 0층의 i호에는 i명이 삶
            apt[i][1] = 1; // 각 층의 1호에는 1명이 삶
        }

        for (int i = 1; i < 15; i++) { // 1층부터 14층까지
            for (int j = 2; j < 15; j++) { // 2호부터 14호까지
                // 1층의 2호는 (1층의 1호 + 0층의 2호)이므로
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(apt[k][n]);
        }
    }
}