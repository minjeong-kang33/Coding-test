class Solution {
    public int solution(int n) {
    	int answer = 0;
    	String[] strArr = Integer.toString(n).split("");
    	
    	for(int i=0; i<strArr.length;i++) {
    		answer+= Integer.parseInt(strArr[i]);
    	}
    	 return answer;
    }
}