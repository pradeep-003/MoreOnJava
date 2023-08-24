package Map_Generic;

import java.util.HashMap;
import java.util.WeakHashMap;

class Employee
{
    private String name;
    private int empId;
    public Employee(String name, int empId)
    {
        this.name = name;
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }
    public String toString()
    {
        return empId + "";
    }

    @Override
    public void finalize()
    {
        System.out.println("Clean up work by GC before de allocating memory from heap ");
    }
}
public class Map6 {
    public static void main(String[] args) {
        Employee e = new Employee("Hyder", 171);

//        HashMap hm = new HashMap();
//        hm.put(e, "Pradeep");
//        System.out.println(hm);
//        e = null; // Employee object is now,Eligible for garbage collection
//
//        System.gc(); // invoking garbage collector
//
//        System.out.println(hm);
//        System.out.println("Last line");

       /* output : {171=Pradeep}
                   {171=Pradeep}
                    Last line

Process finished with exit code 0 */

        WeakHashMap hm = new WeakHashMap();
        hm.put(e, "Pradeep");
        System.out.println(hm);
        e = null; // Employee object is now,Eligible for garbage collection

        System.gc(); // invoking garbage collector

        System.out.println(hm);
        System.out.println("Last line");
    }
}
