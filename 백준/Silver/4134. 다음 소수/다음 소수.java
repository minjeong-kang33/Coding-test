import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.IOException;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			long M = Long.parseLong(br.readLine());

			// BigInteger : 문자열 형태로 이루어져 있어 숫자의 범위가 무한함
			// 문자열 형태이므로 Strng.valueOf를 이용해 받은
			BigInteger bigNumber = new BigInteger(String.valueOf(M));
			BigInteger answer = findPrimeNum(bigNumber);
			System.out.println(answer);
		}
		br.close();

	}

	public static BigInteger findPrimeNum(BigInteger num) {
		// isProbablePrime(10): BigInteger 클래스의 메소드. 소수를 찾음
		if (num.isProbablePrime(10)) {
			return num;
		} else {
			// nextProbablePrime: 받은 BigIntger 숫자(문자열 형태)보다 큰 첫 번째 소수를 찾음
			return num.nextProbablePrime();
		}
	}
}