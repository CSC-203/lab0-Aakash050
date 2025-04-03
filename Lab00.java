import java.sql.SQLOutput;

public class Lab00
{
   public static void main(String[] args) {
      int x;
      x = 5;
      String y;
      y = "Hello";
      double z;
      z = 9.8;
      System.out.println("x: " + x + " y: " + y + " z: " + z);
      int[] nums = {3, 6, -1, 2};
      for (int num : nums) {
         System.out.println(num);
      }
      int num_found = charCount(y, 'l');
      System.out.println("Found: " + num_found);

      for (int i = 0; i < 11; i++) {
         System.out.print(i + " ");
      }

   }


   public static int charCount(String s, char c) {
      int count = 0;
         for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == c) {
               count++;
            }
         }
         return count;
   }

}





