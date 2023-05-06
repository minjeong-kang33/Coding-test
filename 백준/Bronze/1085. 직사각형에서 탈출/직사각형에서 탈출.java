import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
        
        // 0에서 x까지와 최대폭w-x의 길이 중 최소값을 찾음
		int x_min = Math.min(x, w-x); 
        // 0에서 y까지와 최대높이h-y의 길이 중 최소값을 찾음
		int y_min = Math.min(y, h-y);
        
		// 둘 중 최소값을 찾아 출력
		System.out.println(Math.min(x_min, y_min));
	}
 
}