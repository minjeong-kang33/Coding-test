import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] mydice = new int[3];
		
		for(int i=0; i<mydice.length; i++) {
			int num = scanner.nextInt();
			mydice[i] = num;
		}
		scanner.close();
		
		if(mydice[0]==mydice[1]&& mydice[0]==mydice[2]) {
			System.out.println(10000+ mydice[0]*1000);
		}
		else if(mydice[0]==mydice[1]||mydice[0]==mydice[2]){
			System.out.println(1000 + mydice[0]*100);
		}
		else if(mydice[1]==mydice[2]) {
			System.out.println(1000 + mydice[1]*100);
		}
		else {
			Arrays.sort(mydice);
			System.out.println(mydice[2]*100);
		}

	}
}