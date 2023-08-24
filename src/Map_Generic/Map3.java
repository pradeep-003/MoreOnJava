package Map_Generic;

import javax.swing.*;
import java.security.KeyStore;
import java.util.*;

public class Map3
{
    public static void main(String[] args)
    {
        Map map = new HashMap();
        map.put(1, "Rohan"); // Entry
        map.put(2, "Rohit"); // Entry
        map.put(3, "Rahul"); // Entry
        map.put(4, "Ramesh"); //Entry

        System.out.println(map);

        System.out.println(map.get(4));
        System.out.println(map.get(01));

        Set keySet = map.keySet();
        Iterator itr1 = keySet.iterator();

        while(itr1.hasNext())
        {
           // System.out.println(itr1.next());
            Integer rollNo =(Integer) itr1.next();
            System.out.println(rollNo);
        }

        Collection values = map.values();
        Iterator itr2 = values.iterator();

        while(itr2.hasNext())
        {
           // System.out.println(itr2.next());
            String names = (String) itr2.next();
            System.out.println(names);
        }

        Set entrySet = map.entrySet();
        Iterator itr3 = entrySet.iterator();

        while(itr3.hasNext())
        {
            System.out.println(itr3.next());

            Map.Entry data = (Map.Entry)itr3.next();
            System.out.println(data.getKey()+" : " + data.getValue());
        }
    }
}
