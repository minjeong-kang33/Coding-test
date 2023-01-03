import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] strings = my_string.toLowerCase().split("");
        
        Arrays.sort(strings);
        for(int i=0; i<strings.length; i++) {
			answer = answer+strings[i];
		}
        return answer;
    }
}