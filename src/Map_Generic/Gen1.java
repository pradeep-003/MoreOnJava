package Map_Generic;

import java.util.ArrayList;

public class Gen1 {
    public static void main(String[] args) {
        //typeSafety
     /*   String ar[] = new String[10];
        ar[0] = "Hyder";
        ar[1] = "pw";
        // ar[2] = 10; CE

        String name1 = ar[0];
        String name2 = ar[1]; */

        //No typeSafety
     /*   ArrayList al = new ArrayList();
        al.add("Hyder");
        al.add("pw");
        al.add(10);

        String n1= (String)al.get(0);
        String n2 = (String)al.get(1);
        // String n3 = (String)al.get(2); // ClassCastException

      */

        //typeSafety achived using generics

        ArrayList<String> al = new ArrayList<String>();
        al.add("Hyder");
        al.add("pw");
        // al.add(10); CE
        String name1 = al.get(0);
        String name2 = al.get(1);

    }
}
