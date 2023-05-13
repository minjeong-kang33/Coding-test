import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//초기값 0번째: 점 4개=2^2
		//     1번째: 점 9개=3^2
		//     2번째: 점 25개=5^2
		//     3번째: 점 81개=9^2
		
		//2(1증가)3(2증가)5(4증가)9
		//2(2^0증가)3(2^1증가)5(2^2증가)9
		//즉 점의 개수= (2^n+1)^2
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//Math.pow=제곱, 기본이 double형이므로 int로 형변환 필요
		System.out.println((int)Math.pow(Math.pow(2, n)+1,2));
		sc.close();
	}

}