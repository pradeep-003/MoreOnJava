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
        System.out.println(wr);
        for(Week o:wr)
        {
            System.out.println(o + ":" + o.ordinal());
        }
    }
}


/*  OUTPUT
MON
PASS
4
[LAPIandAnnotation.Week;@568db2f2
MON:0
TUE:1
WED:2
THU:3
FRI:4
SAT:5
SUN:6

Process finished with exit code 0

 */