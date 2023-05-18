import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;

		for(int i = 0; i < N; i++) {
			int number = i; // 가장 큰 생성자
			int sum = 0; // 생성자를 이루는 숫자들의 합
			
            // 각 자리수의 숫자를 더함
			while(number != 0) {
				sum += number % 10;
				number /= 10;
			}
            
			if(sum + i == N) {
				answer = i;
				break;
			}
		}
        
		System.out.println(answer);
	}
}