import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        //코드의 수행 횟수: O(n)이므로 n회
        System.out.println(N);
        //수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수: n^1이므로 1
        System.out.print(1);
    }
}