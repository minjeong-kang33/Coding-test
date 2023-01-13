/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		for (int i = 1; i <= N; i++) {
			// 30,60,90,...대 숫자도 거를 수 있도록
			// 10으로 나눴을 때의 몫과 나머지를 먼저 나눠서 생각
			int ten = i / 10;
			int one = i % 10;
			// 10으로 나눴을 때의 몫이 3, 6, 9인 수
			// 즉, 30,60,90, ...대 숫자일 때
			if (ten == 3 || ten == 6 || ten == 9) {
				// 그러면서 1의자리수도 3,6,9인 수. 즉 33, 66, 99 ,...
				if (one == 3 || one == 6 || one == 9) {
					System.out.print("-- ");
					// --만 출력하고 i자체는 출력되지 않도록 continue
					continue;
				}
				System.out.print("- ");
				// 걸러지지 않은 3의 배수들
			} else if (one == 3 || one == 6 || one == 9) {
				System.out.print("- ");
			} else {
				System.out.print(i + " ");
			}
		}

	}

}
