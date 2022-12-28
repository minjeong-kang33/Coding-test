import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
        
        int answer = 1;
		//capacity = 수용가능한 개수. N=1일 경우를 제외하고 상정하므로 초기값=2
		int capacity = 2;
		//N=1일 경우에만 패턴이 적용되지 않으므로 따로 작성
		if(N==1) {
			System.out.println(1);}
		//N>=2일 경우,
		//while문 조건을 N>=2로 하니 무한반복이 발생하여
		//N>=capacity로 조건설정. 수용가능한 개수는 절대 숫자보다 클 수 없으므로.
		else {
			while(N>=capacity) {
				//새로운 수용가능한 개수 = 이전 수용가능한 개수 + (6 * 최소루트)
                //예1) 만약 N이 2일경우, capacity = 초기값2 + (6*초기값1) = 8
			    //	   answer = 1+1 = 2로 반복문 처음으로 돌아감
			    //     capacity 8이 N인 2보다 커졌으므로 반복문 종료. answer=2출력
			    //예2) 만약 N이 60일경우, capacity = 8, answer = 2
		    	//    capacity 8이 N인 60보다 작으므로 반복문 재실행
		    	//    capacity = 8 + (6*2) = 20, answer = 3
		    	// 	  capacity 20이 N인 60보다 여전히 작으므로 반복문 재실행
		    	// 	  capacity = 20 + (6*3) = 38, answer = 4
		    	//	  capacity 38이 N인 60보다 여전히 작으므로 반복문 재실행
		    	//	  capacity = 38 + (6*4) = 62, answer = 5
		    	//    capacity 62가 N인 60보다 커졌으므로 반복문 종료. answer=5출력	
				capacity = capacity + (6*answer);
				answer++;
			}System.out.println(answer);
			
		}
		

	}
}