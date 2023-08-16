import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 출입 기록의 수

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();

            if (map.containsKey(name)) {
                // 이미 있는 이름이 다시 나온 경우 나갔다는 뜻이므로 remove
                map.remove(name);
            } else {
                // 그렇지않다면 이름과 상태를 저장
                map.put(name, state);
            }
        }

        // map을 ArrayList에 담아 역순으로 정렬 후 출력
        ArrayList<String> list = new ArrayList<String>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}