
/**
 * Write a description of class loops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class loops
{
    // instance variables - replace the example below with your own
    private int x;
    private int total;
    private int flour;
    private int butter;
    private int jam;
    private float bflour;
    private float bbutter;
    private float bjam;

    /**
     * Constructor for objects of class loops
     */
    public loops()
    {
        // initialise instance variables
        x = 0;
        total=0;
        for(x=0;x<=150;x++){
         System.out.println(x*13);    
         total=total+(x*13);   
        }
        System.out.println(total);
        flour=total*7;
        System.out.println(flour +" flour");
        butter=total*3;
        System.out.println(butter +" butter");
        jam=total*11;
        System.out.println(jam +" jam");
        bflour=flour/5000;
        System.out.println(bflour +" amount purchased");
        bbutter=butter/500;
        System.out.println(bbutter +" amount purchased");
        bjam=jam/425;
        System.out.println(bjam +" amount purchased");
    }

}
