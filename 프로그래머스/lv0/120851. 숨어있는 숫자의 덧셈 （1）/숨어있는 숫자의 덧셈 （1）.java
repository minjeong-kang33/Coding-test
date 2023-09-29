class Solution {
    public int solution(String my_string) {
        String get_int = my_string.replaceAll("[^0-9]", "");
        int answer = 0;

        for(int i=0; i<get_int.length(); i++){
            answer += Integer.parseInt(get_int.substring(i,i+1));
        }
        
        return answer;
    }
}