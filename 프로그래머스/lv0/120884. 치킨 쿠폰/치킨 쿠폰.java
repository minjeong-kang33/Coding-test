class Solution {
    public int solution(int chicken) {
        int sum = 0;

       while (chicken>=10){
          int service = chicken/10;
          int coupon = chicken%10;
          chicken = service + coupon;
           sum +=service;
       }
        
        return sum;
		
    }
}