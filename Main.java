public class Main {
   public static void main(String[] args) {
      
      System.out.println(dateIsBefore(8,15,8,15));   
      
      
   }
   
   public static boolean dateIsBefore(int m1, int d1, int m2, int d2) {
   
      if(m1 > m2){
         return false;
      }
      
      else if(m1 < m2){
         return true;
      }
      
      else {
         if(d1 < d2){
            return true;
         }
         else {
            return false;
         }
      }
   
   }
}