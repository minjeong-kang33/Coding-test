import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 들은 적 없는 수
        int M = Integer.parseInt(st.nextToken()); // 본 적 없는 수

        // Set에 들은 적 없는 사람 저장
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<String>();
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            // 본 적 없는 사람이 들은 적도 없는 사람이면 list에 저장
            if (set.contains(str)) {
                list.add(str);
            }
        }

        Collections.sort(list);
        System.out.println(list.size()); // 듣도 보도 못 한 사람의 수

        for (String s : list) {
            System.out.println(s);
        }
    }
}