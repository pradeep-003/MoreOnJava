package APIandAnnotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LaunchFE {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list1.add(8);
        list1.add(9);

        System.out.println(list1);

        List<Integer> list2 = Arrays.asList(2, 4, 5, 8, 9);
        System.out.println(list2);
//***************************************************************

//        for(Object o:list2)
//        {
//            System.out.println(o);
//        }

//***************************************************************

//        for(Integer i:list2)
//        {
//            System.out.println(i);
//        }

//***************************************************************

        // ANONYMOUS INNER CLASS
//        Consumer<Integer> cons = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//
//        list2.forEach(cons);

//***************************************************************

//        Consumer<Integer> cons =  integer -> System.out.println(integer);
//
//        list2.forEach(cons);

// ***************************************************************

        //        list2.forEach(n -> System.out.println(n));

//***************************************************************

    }
}
