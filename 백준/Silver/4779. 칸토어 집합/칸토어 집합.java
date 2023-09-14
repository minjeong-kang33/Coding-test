import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while ((str = br.readLine()) != null) {
            sb = new StringBuilder();
            int N = Integer.parseInt(str);

            // N의 3승만큼 '-'문자열 생성
            int length = (int) Math.pow(3, N);
            for (int i = 0; i < length; i++) {
                sb.append("-");
            }

            func(0, length);
            System.out.println(sb);
        }
    }

    private static void func(int start, int length) {
        if (length == 1) {
            return;
        }

        // 길이가 1이 아니라면 3등분한 문자열에서 두번째 묶음을 공백처리
        int newLength = length / 3;
        for (int i = start + newLength; i < start + 2 * newLength; i++) {
            sb.setCharAt(i, ' ');
        }

        func(start, newLength); // 3등분한 문자열에서 첫번째 묶음으로 재귀
        func(start + 2 * newLength, newLength); // 3등분한 문자열의 세번째 묶음으로 재귀
    }
}