package IO_Operation;

import java.io.*;

public class Assig
{
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File dir = new File("pw");
        File file = new File(dir,"pw.txt");
//        FileWriter fw = new FileWriter(file);
//        BufferedWriter bw = new BufferedWriter(fw);
//
//        fw.write("Pradeep Bisht");
//        fw.close();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr,4);

         int a = br.read();
         while (a != -1){
             System.out.println(a);
             a = br.read();
         }
br.close();
    }
}
