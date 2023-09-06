package IO_Operation;

import java.io.File;
import java.io.IOException;

public class LaunchFile2
{
    public static void main(String[] args)
    {
        /* FILE */
        File file1 = new File("pw.txt");
        System.out.println(file1.getName());
        System.out.println(file1.exists()); // false

        try {
            file1.createNewFile(); // CE, so we must handle it
            }
        catch (IOException e)
        {
            System.out.println( "The exception is: "+ e.toString());
        }

        System.out.println(file1.exists());

        /* DIRECTORY */
        File dir = new File("pw");
        System.out.println(dir.exists()); //false

        dir.mkdir();
        System.out.println(dir.exists()); //true
    }
}
