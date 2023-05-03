import java.util.*;
 
class Main {
  public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      
      int middle = (str.length()/2);
      int answer=1;
      
      for(int i=0; i<middle; i++) {
          if(str.charAt(i) != str.charAt(str.length()-1-i)) {
              answer=0;
          }         
      }
      
      System.out.println(answer);
      }
}