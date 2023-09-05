package IO_Operation;
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

    @Override
    public String toString()
    {
        return "name: "+name+", age: " + age +", city: "+ city;
    }
}
public class LaunchIntro1
{
    public static void main(String[] args)
    {
        Student st1 = new Student("Virat", 34, "Delhi");
        System.out.println(st1);

        Student st2 = new Student("Sachin", 54, "Mumbai");
        System.out.println(st2);
    }
}
