import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
/**
 * Write a description of class filewriter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class filewriter
{
    // instance variables - replace the example below with your own
    private int x;
    File myfile = new File ("pizzaTime.txt");
    

    /**
     * Constructor for objects of class filewriter
     */
    public filewriter()
    {
        // initialise instance variables
        x = 0;
       try {
        FileWriter writer = new FileWriter(myfile);
        writer.write("i love you sot;\n");
        writer.write("also love dbd");
        writer.flush();
        writer.close();
       } 
       catch(IOException e) {
          e.printStackTrace();
       }  
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
