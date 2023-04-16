import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int sum = 0;
        int avg_middle = 0;
        
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            sum+=i;
        }
        avg_middle = sum/(array.length);
        answer = array[avg_middle];
        
        return answer;
    }
}