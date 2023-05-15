import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 2; //나눠야하는 수
        while(true) {
            if(n == 1){break;}
            if(n % i == 0) {
                n /= i;
                System.out.println(i);
            } else {
                i++;
            }
        }
    }
}