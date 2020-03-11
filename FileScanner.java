import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * Write a description of class FileScanner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FileScanner
{
    // instance variables - replace the example below with your own
    Scanner inputStream = new Scanner(System.in);
    String file;
    
    
    /**
     * Constructor for objects of class FileScanner
     */
    public FileScanner()
    {
        // initialise instance variables
        System.out.println("file name");
        file = inputStream.nextLine();
        File myFile=new File(file);
        try {
            Scanner readTheFile = new Scanner(myFile);
            while (readTheFile.hasNextLine()){
                System.out.println(readTheFile.nextLine());
            }
        }
        catch(IOException e) {
            e.printStackTrace();
            System.out.println("something bad has happened");
        }
    }

    
}
