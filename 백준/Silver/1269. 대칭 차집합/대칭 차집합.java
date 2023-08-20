import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // A집합 원소의 개수
        int B = Integer.parseInt(st.nextToken()); // B집합 원소의 개수

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < A; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < B; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int answer = 0;
        for (int i : setA){
            // A집합을 돌며 B집합의 값과 다른 값이 있다면 차집합의 수를 증가시킴
            if(!setB.contains(i)){
                answer++;
            }
        }
        for (int i : setB){
            // B집합을 돌며 A집합의 값과 다른 값이 있다면 차집합의 수를 증가시킴
            if(!setA.contains(i)){
                answer++;
            }
        }

        System.out.println(answer);


    }
}