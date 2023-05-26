import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 바구니의 총 갯수
        int m = sc.nextInt(); // 공을 몇 번 바꿀 껀지
        
        // 바구니의 번호가 1부터 시작하므로 +1개의 배열 생성 후
        // 각 바구니에 1부터 번호 부여
		int [] basket = new int[n+1]; 
		for(int i = 1; i <= n; i++){
			basket[i] = i;
        }
        
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
            int b = sc.nextInt();
            // a번째 바구니의 b번째 바구니의 공을 서로 교환
			int temp=basket[a];
			basket[a]=basket[b];
			basket[b]=temp;
		}
        
		for(int i = 1; i <= n; i++){
			System.out.print(basket[i]+ " ");
        }
	}
}