package Map_Generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Worker implements Comparable<Worker>
{
    int id;
    int age;
    String name;

    public Worker(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return ""+id+"-"+name+"-"+age;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Worker w)
    {
        if(this.age>w.age)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
public class LaunchSorting2
{
    public static void main(String[] args)
    {
        Worker w1 = new Worker(721,17,"Ram");
        Worker w2 = new Worker(621,27,"jai");
        Worker w3 = new Worker(521,37,"virus");


        List<Worker> l = new ArrayList<Worker>();
        l.add(w1);
        l.add(w2);
        l.add(w3);

        Collections.sort(l);
        System.out.println(l);

    }
}
