package Map_Generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student
{
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city)
    {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String toString()
    {
        return name + " " + age + " " + city;
    }
}
public class Map4 {
    public static void main(String[] args)
    {
        Student st1 = new Student("Rohan", 18, "Bengaluru");
        Student st2 = new Student("Rohit", 19, "delhi");
        Student st3 = new Student("Ramesh", 22 ,"Mysuru");

        Map map = new HashMap();
        map.put(1, st1);
        map.put(2, st2);
        map.put(3, st3);

        System.out.println(map);

        // without overriding toString the output:
        // {1=Map_Generic.Student@6d03e736, 2=Map_Generic.Student@568db2f2, 3=Map_Generic.Student@378bf509}

        // with overriding toString the output:
        // {1=Rohan 18 Bengaluru, 2=Rohit 19 delhi, 3=Ramesh 22 Mysuru}

        Set data = map.entrySet();
        Iterator itr = data.iterator();

        while(itr.hasNext())
        {
          //  System.out.println(itr.next());
            Map.Entry ent = (Map.Entry)itr.next();
            System.out.println(ent.getKey()+ " : " + ent.getValue());
        }
    }
}
