package IO_Operation;

import java.io.*;

class AIML implements Serializable
{
    private int score;
    transient private String result;
    private int batch;

    public AIML(int score, String result, int batch) {
        this.score = score;
        this.result = result;
        this.batch = batch;
    }
    public void disp()
    {
        System.out.println(score);
        System.out.println(result);
        System.out.println(batch);
    }
}
public class LaunchSDD11
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        AIML  ai = new AIML(82,"pass",1);
//        ai.disp();
//        FileOutputStream fos = new FileOutputStream("E:\\Milestone3onjava\\Test\\test1.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        ObjectOutputStream oos = new ObjectOutputStream(bos);
//
//        oos.writeObject(ai);
//        oos.flush();
//        oos.close();

        FileInputStream fis = new FileInputStream("E:\\Milestone3onjava\\Test\\test1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        AIML aim = (AIML)ois.readObject();
        aim.disp();
        ois.close();
    }
}

/*

82
null
1

 */