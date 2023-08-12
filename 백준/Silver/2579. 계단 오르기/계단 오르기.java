import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // 마지막 n번째 계단을 밟는 방법
        // 1. n-3, n-1을 밟고 n을 밟기
        // 2. n-2를 밟고 n을 밟기
        // => 최고 점수를 얻어야하므로 두 가지 방법 중 큰 값 + n의 값을 구해야함
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] stair = new int[301];
        int[] score = new int[301];
        for (int i = 1; i <= N; i++) {
            stair[i] = sc.nextInt();
            
            score[1] = stair[1];
            score[2] = stair[1] + stair[2];
            score[3] = Math.max(stair[1], stair[2]) + stair[3];
        }

        for (int n = 4; n <= N; n++) {
            score[n] = Math.max(score[n - 3] + stair[n - 1], score[n - 2]) + stair[n];
        }

        System.out.println(score[N]);
    }
}