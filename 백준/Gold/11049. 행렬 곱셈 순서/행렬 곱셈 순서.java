import java.util.Scanner;

public class Main {
    static int N;
    static Matrix[] M;
    static int[][] D;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = new Matrix[N + 1];
        D = new int[N + 1][N + 1];

        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D.length; j++) {
                D[i][j] = -1;
            }
        }

        for (int i = 1; i <= N; i++) {
            int y = sc.nextInt();
            int x = sc.nextInt();
            M[i] = new Matrix(y, x);
        }
        System.out.println(excute(1, N));
    }

    static int excute(int s, int e) {
        int result = Integer.MAX_VALUE;
        if (D[s][e] != -1) {
            return D[s][e];
        }
        if (s == e) { //행렬 1개
            return 0;
        }
        if (s + 1 == e) { //행렬 2개
            return M[s].y * M[s].x * M[e].x;
        }
        // 행렬이 3개 이상
        for (int i = s; i < e; i++) {
            int a = M[s].y * M[i].x * M[e].x;
            // D[s][e] = D[s][i] + D[i+1][e] + a;
            result = Math.min(result, excute(s, i) + excute(i + 1, e) + a);
        }
        return D[s][e] = result;
    }

    static class Matrix {
        private int y;
        private int x;

        Matrix(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}