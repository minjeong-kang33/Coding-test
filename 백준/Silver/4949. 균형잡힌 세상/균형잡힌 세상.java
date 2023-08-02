import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        
        while (true) {
            str = sc.nextLine();
            if (str.equals(".")) { // 종료 조건문
                break;
            }
            System.out.println(check(str));
        }
    }

    public static String check(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '[') { // 여는 괄호일 경우 push
                stack.push(c);
            } else if (c == ')') { // 닫는 괄호 받았을 때, 짝이 안맞으면 no 출력
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                } else { // 짝이 맞으면 stack에서 pop
                    stack.pop();
                }
            } else if (c == ']') { // 닫는 괄호 받았을 때, 짝이 안맞으면 no 출력 
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                } else { // 짝이 맞으면 stack에서 pop
                    stack.pop();
                }
            }
        }
        if (stack.empty()) { // 최종적으로 stack이 비어있으면 모두 짝이 맞음
            return "yes";
        } else {
            return "no";
        }
    }
}
