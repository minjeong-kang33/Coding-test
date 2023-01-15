public class Main {

	public static void main(String[] args) {
		// 생성자가 있는지 없는지를 확인할 것이므로 boolean형의 배열을 사용
		// 구할 숫자는 1~10000이고, 배열내의 첫 번째 값인 0은
		// 사용하지 않을 것이므로 배열 길이는 100001로 설정
		boolean[] numArr = new boolean[10001];

		//1~10000까지 반복하며 n에 d(1~10000)을 대입한다
		//그 대입한 값이 10000보다 같거나 작으면
		//n번째 배열에 true라는 값을 넣는다(배열 boolean형이므로)
		for (int i = 1; i < numArr.length; i++) {
			int n = d(i);
			if(n<=10000) {
				numArr[n] = true;
			}
		}
		//배열값에 false가 들어있는 수, 즉 셀프넘버를 출력
		for(int j=1; j<numArr.length; j++) {
			if(numArr[j]==false) {
				System.out.println(j);
			}
		}

	}

	// d(n)을 구하는 함수
	public static int d(int num) {
		// 합. 즉, d(n)의 결과값이 되는 변수 sum을 정의하고
		// 그 초기값을 n으로 설정
		int sum = num;
		// * 제일 아래에 기술
		while (num != 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		return sum;
	}

}
//설명이 너무 길어져서 노션에 별도 정리
//https://proximal-nerine-5ce.notion.site/0d3c1277c5344bfe9f91723af72a8277