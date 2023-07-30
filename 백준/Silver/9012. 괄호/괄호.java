import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            Stack<Character> stack = new Stack();
            String str = sc.next();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == '(') {
                    stack.push(c); // stack에 쌓음
                } else if (c == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop(); // stack에 담겨있는 (값이 있으므로 하나 제거
                    } else {
                        // 짝이 되는 (값이 없다는 뜻이므로 일단 stack에 담은 채로 반복문 종료
                        stack.push(c); 
                        break;
                    }
                }
            }

            if (stack.isEmpty()) {
                // 최종적으로 stack이 비어있으면 괄호 문자열이므로 YES 출력
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}