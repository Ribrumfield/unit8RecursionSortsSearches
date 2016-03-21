import java.util.Scanner;

public class WC
{
    public static void main(String [] args)
    {
        File inputeFile = new File ("input.txt");
        Scanner in = new Scanner ( inputFile );
        
        while (in.hasNextDouble())
        {
            double value = in.nextDouble();
        }
    }
}
