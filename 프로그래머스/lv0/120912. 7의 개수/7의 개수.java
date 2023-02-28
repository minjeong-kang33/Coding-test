class Solution {
    public int solution(int[] array) {
        int count = 0;

        for(int i=0; i<array.length; i++) {
           while(array[i] > 0){
               //array[i]의 일의 자리수가 7인지 확인
               if(array[i] % 10 == 7){
                   count++;
               }
               //array[i]의 십의 자리수를 일의 자리수로 만든 후 다시 반복
               array[i] = array[i]/10;
           }
        }
        return count;
    }

}
