
/**
 * Write a description of class conditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class conditionals
{
    // instance variables - replace the example below with your own
    private int x;
    private int g;

    /**
     * Constructor for objects of class main
     */
    public conditionals()
    {
        // initialise instance variables
        x = 0;
        
        
        for(g=0; g< 50; g++){
         System.out.println(x);
         x=x+1;
         if(x%5==0) System.out.println("*");
         else if(x%2==0){ 
             System.out.println("even"); 
         
         }
         else {
             System.out.println("odd");
            }
        }
    }

    
}
