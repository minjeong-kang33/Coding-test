import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N의 약수들 중
        int K = sc.nextInt(); // 몇번째로 작은 수를 찾는지
        
        int cnt = 0; // 약수의 개수
        int answer = 0; // K번째로 작은 수
        for(int i = 1; i <= N; i++) {
            // i가 N의 약수(나눴을 때 나머지가 0)일 때 
            if(N % i == 0){
                cnt++;}
            if(cnt == K) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}