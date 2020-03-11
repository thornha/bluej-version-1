
/**
 * Write a description of class arrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class arrays
{
    // instance variables - replace the example below with your own
    Scanner inputStream = new Scanner(System.in);
    String str;
    private int x;
    private int b;
    private int height[] = new int[5];

    /**
     * Constructor for objects of class arrays
     */
    public arrays()
    {
        // initialise instance variables
        x = 0;
        for(x = 0; x<5; x++) {
            System.out.println("enter height");
            str=inputStream.nextLine();
            int num=Integer.parseInt(str);
            height[x]=num;
            
            
        }
        for(b=4; b>=0; b--) {
            System.out.println(height[b]);
        }
        
    }

    
}
