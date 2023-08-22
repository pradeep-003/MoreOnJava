package CollectionFrameWork;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class LaunchLC
{
    public static void main(String[] args)
    {
        Vector v = new Vector();
        v.add(100);
        v.add(200);
        v.add(300);
        v.add(400);
        System.out.println(v);

       Enumeration en = v.elements();

       while (en.hasMoreElements())
       {
           System.out.println(en.nextElement());
       }

//       Iterator itr = v.iterator();
//       while (itr.hasNext())
//       {
//           System.out.println(itr.next());
//       }
    }
}
