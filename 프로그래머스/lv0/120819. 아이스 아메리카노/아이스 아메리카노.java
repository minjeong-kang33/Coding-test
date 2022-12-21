class Solution {
    public int[] solution(int money) {
        int leftMoney = money;
		int coffee = 0;
		while (leftMoney >= 5500) {
			coffee = money / 5500;
			leftMoney = money % 5500;
		}
		
		int[] answer = new int[2];
		answer[0] = coffee;
		answer[1] = leftMoney;
		return answer;
    }
}