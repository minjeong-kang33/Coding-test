import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//2번째 for문에서 1~30까지를 기준으로 정렬할 것이므로 배열사이즈 31로 설정.
		//i<=30으로 하면 array bound 오류 발생 -> i=1~ i<31로 해서 총 30개 들어갈 수 있도록.
		int[] student = new int[31];
		
		//숙제를 낸 28명을 넣는 for문.
		//student배열의 학생번호번째의 값을 모두 1로 치환하여 넣음.
		for (int i = 1; i < 29; i++) {
			int stuNum = sc.nextInt();
			student[stuNum] = 1;
		}
		//총 30명의 학생이 들어갈 수 있는 2번째 for문.
		//아까 1번째 for문에서 숙제를 낸 학생번호의 값이 모두 1로 설정하였으므로,
		//숙제를 내지 않은 학생은 1이 아님 -> 따라서 출력.
		for (int i = 1; i < student.length; i++) {
			if (student[i] != 1) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}