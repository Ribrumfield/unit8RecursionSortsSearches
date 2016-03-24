import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class WC
{
    public static void main(String [] args)
    {
        File inputFile = new File ("input.txt");
        int count = 0;
        try
        {
            Scanner in = new Scanner (inputFile );   
            in.useDelimiter("[^A-Za-z]+");
            while (in.hasNext())
            {
                String i = in.next();
                System.out.println(i);
                count ++;
            }
            in.close();
        }
        catch(FileNotFoundException ae)
        {
            System.out.println("this file does not exsist");
        }
        
        System.out.println("the total number of characters is " + count);
    }
}
