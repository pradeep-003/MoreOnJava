package IO_Operation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LaunchPw9
{
    public static void main(String[] args) throws IOException
    {
        File dir = new File("pw");
        File file = new File(dir,"pw.txt");

        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.write(97);
        pw.write("\n");

        pw.println("java");
        pw.println(100);
        pw.println('a');
        pw.println(50.5);
        pw.println(true);
        pw.print(101);

        pw.close();
    }
}

/*
pw.txt^
a
java
100
a
50.5
true
101
 */
