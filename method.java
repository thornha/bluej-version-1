
/**
 * Write a description of class method here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class method
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class method
     */
    public method()
    {
        // initialise instance variables
        x = 0;
        System.out.println(alwaysTrue());
        System.out.println(backwards(false));
    }

    
    public boolean alwaysTrue()
    {
        // put your code here
        return true;
    }
    public boolean backwards(boolean tnf)
    {
        if (tnf)return false;
        else return true;
    }
}
