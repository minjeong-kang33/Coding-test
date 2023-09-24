import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // 첫 값은 무조건 push
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else if (stack.peek() != arr[i]) {
                // 현재 스택의 마지막 값이 arr[i]가 아닐때 = 즉, 겹치지 않는 값일 때 push
                stack.push(arr[i]);
            }
        }

        answer = new int[stack.size()];
        // 스택이므로 역순으로 출력
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}