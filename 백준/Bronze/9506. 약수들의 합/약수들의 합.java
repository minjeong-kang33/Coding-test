import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            // 입력의 끝을 나타내므로 받은 수가 -1일 경우 break
            if (a==-1) { break;}

            ArrayList<Integer> list = new ArrayList<>();
            int b = 0;
            for (int i = 1; i < a; i++) {
                if (a%i==0) {
                    // 1부터 시작해 i가 a의 약수인 경우 list에 담음
                    list.add(i);
                    b += i;
                }
            }

            if (a==b) {
                System.out.print(a + " = ");
                for (int i = 0; i < list.size(); i++) {
                    if (i != list.size()-1) {
                        System.out.print(list.get(i) + " + ");
                    // 
                    } else if (i == list.size()-1) {
                        System.out.println(list.get(i));
                    }
                }
            } else {
                System.out.println(a + " is NOT perfect.");
            }
        }
    }
}