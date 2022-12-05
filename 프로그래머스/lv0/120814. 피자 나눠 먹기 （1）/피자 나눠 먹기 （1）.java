class Solution {
    public int solution(int n) {
        int answer = n/7;
        int a = n%7; 
        
        if(a>=1){answer+=1;}

        return answer;
    }
}