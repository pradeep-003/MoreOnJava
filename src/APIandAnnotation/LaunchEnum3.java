package APIandAnnotation;

import java.sql.SQLOutput;

enum Result1
{
    PASS, FAIL, NR;

    Result1() {
        System.out.println("Constructor in enum");
    }
}
public class LaunchEnum3
{
    public static void main(String[] args)
    {
        Result1 res = Result1.FAIL;
        switch (res)
        {
            case PASS : System.out.println("Passed!");
                break;
            case FAIL : System.out.println("Failed!");
                break;
            case NR :
                System.out.println("No Result!");
            default:
                System.out.println("*******************");
        }

    }
}


/* OUTPUT:
Constructor in enum
Constructor in enum
Constructor in enum
Failed!
 */