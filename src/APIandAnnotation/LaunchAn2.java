package APIandAnnotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE /* class */, ElementType.FIELD/* variable */, ElementType.METHOD /* method */})
@Retention(RetentionPolicy.RUNTIME)
@interface EveryWhere
{
    String country() default "ASIA";
    int age() default 19;
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) //power of annotation
@interface CricketPlayer
{
    String country();
    int age();
}
@EveryWhere
@CricketPlayer(country = "India", age = 34)
class Virat
{
    @EveryWhere
    private int innings;
    private int runs;
//    @CricketPlayer, CE because CricketPlayer target is class not method
    @EveryWhere
    public void setInnings(int innings) {
        this.innings = innings;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getInnings() {
        return innings;
    }

    public int getRuns() {
        return runs;
    }

}
@EveryWhere
public class LaunchAn2
{
    public static void main(String[] args)
    {
        Virat v = new Virat();
        v.setInnings(3000);
        v.setRuns(10034276);
        System.out.println( v.getInnings());
        System.out.println( v.getRuns());

        Class c = v.getClass();
        Annotation a=c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer) a;

        String con = cp.country();
        int age = cp.age();

        System.out.println(con);
        System.out.println(age);


        Annotation an = c.getAnnotation(EveryWhere.class);
        EveryWhere ew = (EveryWhere) an;

        String s = ew.country();
        System.out.println(s);
        System.out.println(ew.age());

        /*            OUTPUT:
                              3000
                              10034276
                              India
                              34
                              ASIA
                              19
        */


    }
}
