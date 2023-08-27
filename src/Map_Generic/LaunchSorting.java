package Map_Generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2
{
    int marks;
    int age;
    String name;

    public Student2(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ""+ marks + "-"+ age + "-" + name;
    }
}

//class Alpha implements Comparator<Student2>
//{
//    public int compare(Student2 a, Student2 b)
//    {
//        if(a.marks>b.marks)
//        {
//            return 1;
//        }
//        else
//        {
//            return -1;
//        }
//    }
//}
public class LaunchSorting {
    public static void main(String[] args) {

      //  Alpha a = new Alpha();

//        Comparator<Student2> a = new Comparator<Student2>()
//        {
//          @Override
//            public int compare(Student2 a, Student2 b) {
//                if(a.age>b.age)
//                {
//                    return 1;
//                }
//                else
//                {
//                    return -1;
//                }
//            }
//        };

//        Comparator<Student2> a = (Student2 k, Student2 p)->{
//            if(k.marks>p.marks)
//            {
//                return 1;
//            }
//            else
//            {
//                return -1;
//            }
//        };

        Student2 st1 = new Student2(45, 18, "Rohan");
        Student2 st2 = new Student2(50, 17, "Rohit");
        Student2 st3 = new Student2(25, 22, "Ramesh");


        List<Student2> list = new ArrayList<Student2>();
        list.add(st1);
        list.add(st2);
        list.add(st3);




        // Collections.sort(list);
        Collections.sort(list, (Student2 k, Student2 p)->{
            if(k.marks>p.marks)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        } );
        System.out.println(list);
    }
}
