package IO_Operation;

import java.io.File;
import java.io.FileWriter;

public class LaunchFW4
{
    public static void main(String[] args) throws Exception
    {
        File dir = new File("pw");
        File file = new File(dir,"java.txt");
        // file.createNewFile();

        //FileWriter fw = new FileWriter(file, false); // no need of writing false because it's by default
        // Written data is overridden type so, whenever you run the previous time Ran data will override
        // if, you don't want override then use below way:
        //FileWriter fw = new FileWriter(file, true);
        FileWriter fw = new FileWriter(file);

        fw.write("java\n");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        char ch[] = {'j', 'a', 'v', 'a'} ;
        fw.write(ch);
        fw.write("\n");
        //fw.close(); , if you don't write close method then new data won't be stored
        //fw.close();
        fw.flush(); // if not using close then use flush method to store data and later close file

        System.out.println("open java.txt to see result");
    }
}
