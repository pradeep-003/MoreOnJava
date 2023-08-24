package Map_Generic;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map2
{
    public static void main(String[] args)
    {
        HashMap hm1 = new HashMap();
        hm1.put(01, "Virat");
        hm1.put(02, "Ronit");
        hm1.put(03, "Rohan");
        hm1.put(null, "Nobody");
        hm1.put(04, "Ronit");
        hm1.put(null, null);  // key must be unique
        hm1.put(04, "Ronit");
        System.out.println(hm1);

        HashMap hm2 = new HashMap();
        hm2.put("virat", "Rohit");
        hm2.put("Rohit", "Rohan");
        hm2.put("Hyder", "Rohan");

        System.out.println(hm2);

        LinkedHashMap lhm = new LinkedHashMap(); // order of insertion Prevent
        lhm.put("virat", "Rohit");
        lhm.put("Rohit", "Rohan");
        lhm.put("Hyder", "Rohan");
        lhm.put(null, null);

        System.out.println(lhm);

    }
}
