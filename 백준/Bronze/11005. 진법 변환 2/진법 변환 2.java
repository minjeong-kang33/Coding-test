import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int B = sc.nextInt();
   
       // B는 2~36까지의 수만 주어지지만 편의상 36개를 담는 배열생성
       char arr[]=new char[36];
       // 10진법 미만일 경우
       for(int i=0;i<10;i++){
            arr[i]=(char) (i+'0');
        }
        // 10진법 이상일 경우
        for(int i=10;i<36;i++) {
	    	arr[i]=(char) (i+'A'-10);
	    }
    
        long result=0;
	    String answer="";
	    while(N>0) {
		    result=N%B;
		    N=N/B;
		    answer=arr[(int)result]+answer;
	    }
	    System.out.print(answer);
    }
}
