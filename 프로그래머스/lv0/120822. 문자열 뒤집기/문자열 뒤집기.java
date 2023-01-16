class Solution {
    public String solution(String my_string) {
        String answer ="";
        for(int i=my_string.length()-1; i>=0; i--){
            //substring(시작지점, 끝나는지점+1
            answer+= my_string.substring(i,i+1);
        }
        return answer;
    }
}