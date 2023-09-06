package IO_Operation;

import java.io.File;
import java.io.IOException;

public class LaunchFile3
{
    public static void main (String[] args) throws IOException
    {
//        File dir = new File("PwJAVA");
//        System.out.println(dir.isDirectory()); // false
//        dir.mkdir();
//        System.out.println("dir is referring to Directory PwJAVA " + dir.isDirectory()); //true
//
//        File file = new File(dir, "pwsSkill.txt");
//        file.createNewFile();
//        System.out.println(file.isFile()); //true

       // File f = new File("PwJAVA");
        File f = new File("E:\\Milestone3onjava\\src\\IO_Operation");
        int count = 0;
        String str[] = f.list();

        for (String name:str)
        {
            count++;
            System.out.println(name);
        }
        System.out.println("No. of Files are" + count);
    }

}

/* output:
LaunchFile2.java
LaunchFile3.java
LaunchIntro1.java
No. of Files are3
 */