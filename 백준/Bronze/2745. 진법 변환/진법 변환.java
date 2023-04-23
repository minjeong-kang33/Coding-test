import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
        int b = sc.nextInt();

        int result = 0;
        int idx = 0; // 2의 몇 idx승
        int num = 0;
        
        // 숫자 n 역순으로 재배치한 c 생성
        for (int i=n.length()-1; i>=0; i--) {
            char c = n.charAt(i);
            if (c>='0' && c<='9') // 0~9사이는 그대로 출력
                num = c - '0';
            else
                num = c - 55; // A~Z는 숫자로 변경
            result += num * Math.pow(b, idx++);
        }
        System.out.println(result);
    }
}