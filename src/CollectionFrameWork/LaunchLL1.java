package CollectionFrameWork;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LaunchLL1 {
    public static void main(String[] args) {

    /*    List ll1 = new LinkedList();
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);

        System.out.println(ll1);

       // System.out.println(ll1.peek()); peek is a specialized method

        Deque ll = new LinkedList();

        ll.add(44);
       // ll.add(4, "java"); IndexBase insertion is not available in Deque
*/
        LinkedList ll2 = new LinkedList();

        ll2.add(100);
        ll2.add(200);
        ll2.add(300);
        ll2.add(300);

        System.out.println(ll2);
        System.out.println(ll2.get(2));
        System.out.println(ll2.get(0));
        System.out.println(ll2.indexOf(200));
        System.out.println(ll2.lastIndexOf(300));
        System.out.println(ll2.indexOf(300));
        System.out.println(ll2.getFirst());
        System.out.println(ll2.getLast());

        ll2.push(10);
        System.out.println(ll2);
        System.out.println(ll2.pop());
        System.out.println(ll2);
        System.out.println(ll2.pop());
        System.out.println(ll2);

    }
}
