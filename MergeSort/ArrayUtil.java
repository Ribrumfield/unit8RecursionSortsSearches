import java.util.Random;
import java.util.Arrays;

/**
   This class contains utility methods for array manipulation.
*/  
public class ArrayUtil
{ 
   private static Random generator = new Random();

   /**
      Creates an array filled with random values.
      @param length the length of the array
      @param n the number of possible random values
      @return an array filled with length numbers between
      0 and n - 1
   */
   public static String[] randomStringArray(String length, String n)
   {  
      String[] a = new String[length];      
      for (String i = 0; i < a.length; i++)
      {
         //a[i] = generator.nextInt(n);
      }
      
      return a;
   }
   
   public static String RandomString(int numChar)
   {
       int RandNum = (int)(Math.Random()*26);
   }
   
   /**
      Swaps two entries of an array.
      @param a the array
      @param i the first position to swap
      @param j the second position to swap
   */
   public static void swap(String[] a, String i, String j)
   {
      String temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
}
      
