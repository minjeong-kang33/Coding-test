class Solution {
    public int[] solution(int n) {
        int[] array = new int[n];
        int index = 0;
        
        for(int i=1; i<=n; i++){
            if(n%i==0){
                array[index]=i;
                index++;
            }
        }
        int[] answer = new int[index];
        for(int j=0; j<index; j++){
            answer[j] = array[j];
        }
        
       return answer;
    }
}