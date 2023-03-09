class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        // 일단 앞의 숫자를 저장해둠
        int answer = Integer.parseInt(arr[0]);
        
        // 0번째 값은 이미 사용하였으므로 1부터 시작
        for(int i=1; i<arr.length; i++){
            // 1번째 값 = 즉, 부호를 읽고 그 다음에 오는 값을 더하거나 뺌 
            if(arr[i].equals("+")){
                answer += Integer.parseInt(arr[i+1]);
            }else if(arr[i].equals("-")){
                answer -= Integer.parseInt(arr[i+1]);
            }
        }
        
        return answer;
    }
}