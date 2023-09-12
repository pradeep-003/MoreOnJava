package IO_Operation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchBWFW7
{
    public static void main(String[] args) throws IOException {

        File dir = new File("pw");
        File file = new File(dir, "java.txt");

        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char ch[] = {'p','w','s','j'};
        bw.write(ch);

        bw.flush();
        bw.close();

    }
    
}
