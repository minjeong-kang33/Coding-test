import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int dayUp = Integer.parseInt(st.nextToken()); 
		int nightDown = Integer.parseInt(st.nextToken());
		int tree = Integer.parseInt(st.nextToken());

		//day = tree/(dayUp-nightDown)라고 생각하기 쉬운데
		//정상에 도달하면 더이상 미끄러지지 않는다는 전제가 있으므로
		//마지막 날에는 nightDown의 영향을 받지 않는다
		//그러므로 올라가야할 나무의 높이는 tree-nightDown이 된다
		int day = (tree-nightDown)/(dayUp-nightDown);
		//딱 나누어 떨어지지 않는 경우 = 다 올라가지 못 한 경우에는
		//하루 더 걸리므로 if !=0으로 day++한다
		if((tree-nightDown)%(dayUp-nightDown)!=0) {
			day++; 
		}
		System.out.println(day);

		
	}

}

