
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    // instance variables - replace the example below with your own
    private int x;
    private int b;
    private int g;

    /**
     * Constructor for objects of class main
     */
    public main()
    {
        // initialise instance variables
        x = 0;
        b = 1;
        
        for(g=0; g< 50; g++){
         System.out.println(x);
         System.out.println(b);
         x= x+b;
         b= x+b;
        
        }
    }

    
}
