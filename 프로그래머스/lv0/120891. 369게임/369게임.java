class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order>0){
            int n_order = order%10;
            if(n_order!=0 && n_order%3==0){
                answer++;
            }
            order/=10;
        }
        return answer;
    }
}