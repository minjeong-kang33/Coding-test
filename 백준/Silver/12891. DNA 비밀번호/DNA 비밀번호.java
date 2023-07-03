import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] myArr;
	static int[] checkArr;
	static int checkSecret;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int S = Integer.parseInt(st.nextToken()); // 전체 문자열의 크기
		int P = Integer.parseInt(st.nextToken()); // 부분 문자열의 크기
		int result = 0;
		
		checkArr = new int[4]; // 각 DNA 문자열의 최대 허용 개수
		myArr = new int[4]; // 현재 부분 문자열에 포함된 각 DNA 문자의 개수
		char[] A = new char[S];
		checkSecret = 0; // 문자 개수를 충족했는지 판단하는 변수
		
		A = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0) {
				checkSecret++;
			}
		}

		for (int i = 0; i < P; i++) {
			Add(A[i]);
		}
		
		if (checkSecret == 4) {
			result++;
		}

		// 슬라이딩 윈도우
		for (int i = P; i < S; i++) {
			// 현재 윈도우에서 제외될 문자의 인덱스를 계산
			int j = i - P; 
			Add(A[i]); // 현재 윈도우에 포함된 새로운 문자를 처리
			Remove(A[j]); // 현재 윈도우에서 제외되는 이전 문자를 처리
			if (checkSecret == 4) {
				result++;
			}
		}

		System.out.println(result);
		br.close();

	}
	
	// 이전 문자를 처리해 checkSecret값이 조건을 만족하는지 확인하고 myArr을 업데이트
	private static void Remove(char c) {
		switch (c) {
		case 'A': 
			if (myArr[0] == checkArr[0]) checkSecret--;
			myArr[0]--;
			break;
		case 'C': 
			if (myArr[1] == checkArr[1]) checkSecret--;
			myArr[1]--;
			break;
		case 'G': 
			if (myArr[2] == checkArr[2]) checkSecret--;
			myArr[2]--;
			break;
		case 'T': 
			if (myArr[3] == checkArr[3]) checkSecret--;
			myArr[3]--;
			break;
		}
	}
	
	// 각 문자의 개수 조선을 체크하여 checkSecret값을 업데이트
	private static void Add(char c) {
		switch (c) {
		case 'A': 
			myArr[0]++;
			if (myArr[0] == checkArr[0]) checkSecret++;
			break;
		case 'C': 
			myArr[1]++;
			if (myArr[1] == checkArr[1]) checkSecret++;
			break;
		case 'G': 
			myArr[2]++;
			if (myArr[2] == checkArr[2]) checkSecret++;
			break;
		case 'T': 
			myArr[3]++;
			if (myArr[3] == checkArr[3]) checkSecret++;
			break;
		}
	}
}