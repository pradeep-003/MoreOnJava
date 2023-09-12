package IO_Operation;

import java.io.*;

public class LaunchBRFR8
{
    public static void main(String[] args) throws IOException
    {

        File dir = new File("pw");
        File file = new File(dir,"pw.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while(line != null)
        {
            System.out.println(line);
            line = br.readLine();
        }
    }
}
