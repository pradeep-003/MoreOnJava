package IO_Operation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LaunchFR5
{
    public static void main(String[] args) throws IOException
    {
        File dir = new File("pw");
        File file = new File(dir,"java.txt");

        FileReader fd = new FileReader(file);
        int i = fd.read();
        System.out.println((char)i); // j

        while(i != -1)
        {
            System.out.print(i+"----->");
            System.out.println((char)i);
            i = fd.read();
        }
    }
}


/* output:
j
106----->j
97----->a
118----->v
97----->a
10----->

65----->A
10----->

97----->a
10----->

106----->j
97----->a
118----->v
97----->a
10----->


Process finished with exit code 0
 */
