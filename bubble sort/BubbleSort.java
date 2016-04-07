import java.util.Arrays;
import java.util.Random;

public class BubbleSort
{
    public static void sort(int[] a)
    {
        boolean sorted = false;
        while(sorted = false)
        {
            for ( int i = 0; i < a.length; i ++)
            {
              
            }
        }
    }
    
    public static void main(String [] args)
    {
         int[] a = ArrayUtil.randomIntArray(20, 100);
         System.out.println(Arrays.toString(a));
         
         BubbleSort.sort(a);
         
         System.out.println(Arrays.toString(a));
    }
}
