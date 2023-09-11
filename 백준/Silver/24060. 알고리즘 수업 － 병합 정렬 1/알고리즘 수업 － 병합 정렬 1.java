import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] A, tmp;
    static int K;
    static int count = 0;
    static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 배열의 크기
        A = new int[N];
        K = Integer.parseInt(st.nextToken()); // 저장 횟수

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        tmp = new int[N];
        merge_sort(A, 0, N - 1);
        System.out.println(result);


    }

    private static void merge_sort(int[] A, int p, int r) {
        /*merge_sort(A[p..r]) { # A[p..r]을 오름차순 정렬한다.
            if (p < r) then {
                q <- ⌊(p + r) / 2⌋;       # q는 p, r의 중간 지점
                merge_sort(A, p, q);      # 전반부 정렬
                merge_sort(A, q + 1, r);  # 후반부 정렬
                merge(A, p, q, r);        # 병합
            }
        }*/
        if (count > K) return; // 이미 찾은 값이 K번째를 넘어선 경우
        if (p < r) {  // 왼쪽 인덱스가 오른쪽 인덱스보다 작을 경우
            int q = (p + r) / 2; // 중간 인덱스를 구함
            merge_sort(A, p, q);
            merge_sort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    public static void merge(int[] A, int p, int q, int r) {
        /*merge(A[], p, q, r) {
            i <- p; j <- q + 1; t <- 1;
            while (i ≤ q and j ≤ r) {
                if (A[i] ≤ A[j])
                then tmp[t++] <- A[i++]; # tmp[t] <- A[i]; t++; i++;
        else tmp[t++] <- A[j++]; # tmp[t] <- A[j]; t++; j++;
            }
            while (i ≤ q)  # 왼쪽 배열 부분이 남은 경우
            tmp[t++] <- A[i++];
            while (j ≤ r)  # 오른쪽 배열 부분이 남은 경우
            tmp[t++] <- A[j++];
            i <- p; t <- 1;
            while (i ≤ r)  # 결과를 A[p..r]에 저장
            A[i++] <- tmp[t++];
        }*/
        int i = p; // 첫번째 배열의 시작 인덱스
        int j = q + 1; // 두번째 배열의 시작 인덱스
        int t = 0; // 임시배열의 인덱스

        while (i <= q && j <= r) { // 두 배열을 비교하며 작은 값을 임시배열 tmp에 저장
            if (A[i] <= A[j]) {
                tmp[t] = A[i];
                i++;
            } else {
                tmp[t] = A[j];
                j++;
            }
            t++;
        }

        while (i <= q) // 첫 번째 배열이 남은 경우, 남은 원소들을 임시배열에 복사
            tmp[t++] = A[i++];

        while (j <= r) // 두 번째 배열이 남은 경우, 남은 원소들을 임시배열에 복사
            tmp[t++] = A[j++];

        i = p;
        t = 0;
        while (i <= r) { // A배열의 시작인덱스에서 끝인덱스까지
            count++; // 병합완료된 원소의 개수
            if (count == K) { // K번째를 찾았을 때
                result = tmp[t];
                break;
            }
            A[i++] = tmp[t++]; // tmp배열의 원소를 A배열로 복사
        }
    }
}