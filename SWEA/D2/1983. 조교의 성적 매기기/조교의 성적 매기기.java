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
		String[] grade = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int i = 1; i <= testCase; i++) {
			int student = sc.nextInt();
			int stu_num = sc.nextInt();
			//학생의 수만큼 중간,기말,과제성적으로 산출한 결과 score를 담는 배열 생성
			double[] score = new double[student];

			for (int j = 0; j < student; j++) {
				int mid = sc.nextInt();
				int fin = sc.nextInt();
				int assign = sc.nextInt();
				score[j] = (mid * 0.35) + (fin * 0.45) + (assign * 0.2);
			}

			int index = 0;
			//stu_num번째 학생의 총점과 다른 학생의 총점이 동일한 경우는 존재하지 않으므로
			//Arrays.sort로 정렬하지않고 값을 비교하여 index를 구함
			//여기서 score[stu_num-1]을 하는 것은 배열이 0부터 시작하기 때문.
			for (int k = 0; k < student; k++) {
				if(score[k]>score[stu_num-1]) {
					index++;
				}
			}
			//같은 grade를 받을 수 있는 학생의 수는 student/10이므로
			//grade배열에서 index/(student/10)번째 값을 출력
			System.out.println("#" + i + " " + grade[index / (student / 10)]);

		}
	}
}
