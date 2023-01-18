class Solution {
    public String solution(String my_string) {
        String answer = "";
    
    for(int i=0; i<my_string.length(); i++) {
        // .indexOf(): 괄호안의 값의 인덱스 위치를 찾음
        // my_string.charAt(i): my_string의 i번째에 해당하는 문자 1개
        
        if(my_string.indexOf(my_string.charAt(i)) == i) {
            // i번째 문자가 my_string에서 처음으로 발견되었을 때에만 answer에 담아 출력
            answer += my_string.charAt(i);}
    }
        
    return answer;
}
}