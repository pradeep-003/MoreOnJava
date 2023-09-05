package APIandAnnotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LaunchSTR {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 5, 8, 9);

        Stream<Integer> streamData = list.stream();


        streamData.forEach(n -> System.out.println(n));
//          streamData.forEach(n -> System.out.println(n)); //java.lang.IllegalStateException, Runtime Exception
    // we can use a stream for only one Operation




    }
}

/* output:
        2
        4
        5
        8
        9

 */