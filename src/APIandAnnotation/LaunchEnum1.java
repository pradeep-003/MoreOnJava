package APIandAnnotation;

enum Week
{
    MON, TUE, WED, THU, FRI, SAT, SUN;
}
public class LaunchEnum1
{
    enum Result
    {
        PASS, FAIL, NR
    }
    public static void main(String[] args)
    {
//      Enum can't be initialized
        Week w= Week.MON;
        System.out.println(w);

        Result r = Result.PASS;
        System.out.println(r);

        int index = Week.FRI.ordinal();
        System.out.println(index);

        Week[] wr = Week.values();
        for(Week o:wr)
        {
            System.out.println(o + ":" + o.ordinal());
        }
    }
}
