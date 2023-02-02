class Solution {
    public String[] solution(String my_str, int n) {
        // my_str의 길이와 n의 개수만큼 가변적으로 변하는 answer[] 생성
        String[] answer= new String[(my_str.length()+n-1)/n];

		for(int i=0; i<answer.length; i++) {
            // 결과값이 n개 만큼 꽉 차는 경우
			if(i<my_str.length()/n) {
				answer[i] = my_str.substring(i*n, (i+1)*n);
                // my_str의 길이가 n으로 나누어 떨어지지 않는 경우. (=부분적으로 빈 바구니)
			}else {
				answer[i] = my_str.substring(i*n, my_str.length());
			}
		}
        return answer;
    }
}