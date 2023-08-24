package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GPT {
    public static void main(String[] args) {
        List/* <String> */ fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            String fruit = itr.next();
            if (fruit.equals("Banana")) {
                itr.remove(); // Removes "Banana" from the list
            }
        }

        System.out.println(fruits); // Output: [Apple, Cherry]
    }
}
