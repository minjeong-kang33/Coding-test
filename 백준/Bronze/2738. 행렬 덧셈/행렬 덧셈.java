import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt(); //N행M열의 배열이 주어짐
        
        //배열은 0부터 시작하므로 N+1행, M+1행의 열을 갖는 2차원 배열생성
        int[][] A = new int[N+1][M+1]; 
        int[][] B = new int[N+1][M+1];
        
        //2차원배열 A에 받은 수를 담음
        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                A[i][j] = sc.nextInt(); 
            }
        }
        //2차원배열 B에 받은 수를 담음
        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
               B[i][j] = sc.nextInt(); 
            }
        }
        
        int [][] answer = new int [N+1][M+1];
        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                answer[i][j] = A[i][j] + B[i][j];
            }
        }
 
        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                System.out.print(answer[i][j] + " ");
            }System.out.println();
        }
    }
}