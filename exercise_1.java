
/**
 * Write a description of class exercise_1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class exercise_1
{
    // instance variables - replace the example below with your own
    Scanner inputStream = new Scanner(System.in);
    private int x;
    String str;

    /**
     * Constructor for objects of class exercise_1
     */
    public exercise_1()
    {
        // initialise instance variables
        x = 0;
        System.out.println("enter number");
        str=inputStream.nextLine();
        int num=Integer.parseInt(str);
        int low=num-1;
        int high=num+1;
        low=low*num;
        high=high*num;
        System.out.println(low + high);
    }

}
