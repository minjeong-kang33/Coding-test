import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Set<String> set = new HashSet<>(); // 중복값을 허용하지않으므로 HashSet 사용

        // str의 문자 길이만큼 반복
        for (int i = 0; i < str.length(); i++) {
            // i번째 문자부터 시작해서 그 뒤의 문자를 하나씩 더해 붙여가며 저장
            for (int j = i + 1; j <= str.length(); j++) {
                set.add(str.substring(i, j));
            }
        }

        System.out.println(set.size());

    }
}