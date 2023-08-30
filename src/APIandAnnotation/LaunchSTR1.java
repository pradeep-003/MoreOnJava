package APIandAnnotation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LaunchSTR1
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8, 4, 2, 7, 5);
        Stream<Integer> streamData = list.stream();

//      long count = streamData.count();
//      System.out.println(count);

//********************************************************************

//        Stream<Integer> streamSorted = streamData.sorted();
//        streamSorted.forEach(n -> System.out.println(n));

//********************************************************************

//        Stream<Integer> filterstream = streamData.filter(n->n%2==0);
//        Stream<Integer> streamSorted = filterstream.sorted();

//        // Stream<Integer> streamSorted = streamData.sorted(); IllegalStateException
//
//        Stream<Integer> mapStream = filterstream.map(n-> n*2);
//        mapStream.forEach(n-> System.out.println(n));

//********************************************************************

//        Stream<Integer> finalStream = streamData.filter(n->n%2==0).sorted().map(n->n*2);
//        finalStream.forEach(n-> System.out.println(n));

//********************************************************************

//        Consumer<Integer> cons = new Consumer() {
//            @Override
//            public void accept(Object o) {
//                System.out.println(o);
//            }
//        };
//        Predicate<Integer> pre = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer i) {
//               if(i%2 == 0)
//                   return true;
//               else
//                   return false;
//            }
//        };
//        Stream<Integer> finalStream = streamData.filter(pre).sorted().map(n->n*2);
//        finalStream.forEach(cons);

//********************************************************************

        Consumer<Integer> cons = o -> System.out.println(o);

        Predicate<Integer> pre = i -> i%2==0;

/*
        i % 2 == 0 in lambda expression means written below

        if (i % 2 == 0)
            return true;
        else
            return false;
*/

        Stream<Integer> finalStream = streamData.filter(pre).sorted().map(n->n*2);
        finalStream.forEach(cons);


    }
}
