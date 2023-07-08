import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
        sc.close();
        
        String answer = "";
        for (int i = 0; i < arr.length - 1; i++) {
            // 현재 값이 다음 값의 -1일 때
        	if (arr[i] == arr[i + 1] - 1) {
            	answer = "ascending";
            // 현재 값이 다음 값의 +1일 때
			} else if (arr[i] == arr[i + 1] + 1) {
            	answer = "descending";
            } else {
            	answer = "mixed";
                break;
            }
        }
        System.out.println(answer);
    }
}