import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 주어지는 정보
        int M = Integer.parseInt(st.nextToken()); // 확인해야하는 정보

        // 입력값으로 문자가 주어질지, 숫자가 주어질 지 모르므로
        // 각각 문자와 숫자를 key값으로 하는 HashMap 2개 생성
        HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
        HashMap<String, Integer> hash2 = new HashMap<String, Integer>();

        for (int index = 1; index <= N; index++) {
            String name = br.readLine();
            hash1.put(index, name);
            hash2.put(name, index);
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            // 숫자를 입력받으면 숫자가 key값인 hash1에서 값 탐색
            if (49 <= str.charAt(0) && str.charAt(0) <= 57) {
                int index = Integer.parseInt(str);
                System.out.println(hash1.get(Integer.parseInt(str)));
            } else {
                // 문자를 입력받으면 문자가 key값인 hash2에서 값 탐색
                System.out.println(hash2.get(str));
            }
        }

    }
}