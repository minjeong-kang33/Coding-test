import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 요소들 중 가장 작은 값들의 합이 누적되게 해야함
        // 즉, 계산 할 때마다 정렬이 필요 -> 우선순위 큐 사용
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        for (int i = 0; i < N; i++) {
            priorityQueue.add(sc.nextInt());
        }

        int num = 0;
        while (priorityQueue.size() > 1) {
            int temp1 = priorityQueue.poll();
            int temp2 = priorityQueue.poll();

            num += temp1 + temp2;
            priorityQueue.add(temp1 + temp2); //합한 묶음 다시 넣기
        }

        System.out.println(num);
    }
}