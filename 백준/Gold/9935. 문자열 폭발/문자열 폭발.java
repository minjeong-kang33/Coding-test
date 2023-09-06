import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String bomb = br.readLine();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            // 입력받은 문자열을 charAt으로 쪼개서 stack에 담음
            stack.push(str.charAt(i));

            // 스택의 크기가 폭탄 문자열의 길이보다 커야만, 폭탄 문자열이 존재할 수 있으므로 검사 실시
            if (stack.size() >= bomb.length()) {
                boolean isSame = true;
                for (int j = 0; j < bomb.length(); j++) {
                    // 현재 스택의 맨 위에서부터 폭탄 문자열의 길이만큼 앞에 있는 위치에서 비교
                    if (stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)) {
                        isSame = false;
                        break;
                    }
                }
                if (isSame) {
                    // 폭탄 문자열의 길이만큼 스택에서 문자를 제거
                    for (int j = 0; j < bomb.length(); j++)
                        stack.pop();
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("FRULA");
        } else {
            for (char ch : stack) {
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}