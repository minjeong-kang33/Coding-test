import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        for (int i = 0; i < str.length(); i++) {
            // 일단 한 문자씩 출력
            char c = str.charAt(i);
            System.out.print(c);
            
            // i가 9로 끝나는 경우 (0부터 시작했으므로) 행바꿈
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
