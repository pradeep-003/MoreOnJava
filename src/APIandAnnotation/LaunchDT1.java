package APIandAnnotation;

//  import java.util.ArrayList;

//  import java.util.Date;
public class LaunchDT1
{
    public static void main(String[] args)
    {
        java.util.Date dt = new java.util.Date();

        java.util.ArrayList<String> al = new java.util.ArrayList<String>();

        System.out.println(dt);

        long timeInMs = dt.getTime();

        java.sql.Date dt1 = new java.sql.Date(timeInMs);

        System.out.println(dt1);
    }
}
