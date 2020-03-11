
/**
 * Write a description of class strings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class strings
{
    // instance variables - replace the example below with your own
    Scanner inputStream = new Scanner(System.in);
    
    private int x;
    String name;
    String word;

    /**
     * Constructor for objects of class strings
     */
    public strings()
    {
        // initialise instance variables
        word="bob";
        int n=word.length();
        System.out.println(n);
        
        
        System.out.print("stuff");
        name = inputStream.nextLine();
        System.out.println("hi");
        String s1,s2,s3,s4;
        s1="wellington"; s2="High";
        s3=s1.concat(s2);
        System.out.println(s3);
        s4=s1+s2;
        System.out.println(s4);
        name.charAt(1);
        name.length();
        x = 0;
    }

    
}
