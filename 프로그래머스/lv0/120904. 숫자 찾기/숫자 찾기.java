class Solution {
    public int solution(int num, int k) {
        String new_num = Integer.toString(num);
		String new_k = Integer.toString(k);
		
		// num안에 k가 존재하지 않는경우 
        // indexOf의 값은 자동으로 -1이 되므로 그대로 출력
		if(new_num.indexOf(new_k)==-1) {
			return -1;
		}else {
			return new_num.indexOf(new_k)+1;
		}
    }
}