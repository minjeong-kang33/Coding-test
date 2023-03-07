class Solution {
    public int solution(String[] babbling) {
       int answer = 0;
		
		for(int i =0; i < babbling.length; i++) {
			// 발음가능한 값을 가지고 있다면 0으로 치환
            babbling[i] = babbling[i].replaceFirst("aya", "0");
            babbling[i] = babbling[i].replaceFirst("woo", "0");
            babbling[i] = babbling[i].replaceFirst("ye", "0");
            babbling[i] = babbling[i].replaceFirst("ma", "0");
            // 0으로 치환된 값을 공백으로 변환
            // 처음부터 공백으로 하지않은 이유: 중간값이 발음가능한 경우 (w'ye'oo)
            // 중간 글자가 공백처리되면 생기는 새로운 조합('woo')이 
            // 의도와 다르게 발음이 가능한 것으로 처리되기 때문
            babbling[i] = babbling[i].replace("0", "");
            
            // 공백값을 갖게된 = 모두 발음가능한 발음인 경우 answer 값을 증가시킴
            if(babbling[i].equals("")) {
                answer++;
            }
        }
        return answer;
    }
}