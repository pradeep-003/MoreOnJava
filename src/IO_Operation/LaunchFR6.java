package IO_Operation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LaunchFR6
{
    public static void main(String[] args) throws IOException
    {
        File dir = new File("pw");
        File file = new File(dir,"java.txt");

        FileReader fd = new FileReader(file);

        char ch[] = new char[(int) file.length()];

        fd.read(ch);
        for(char data:ch)
        {
            System.out.print(data);
        }
    }
}
