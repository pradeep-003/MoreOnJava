package IO_Operation;

import java.io.*;

class Employee implements Externalizable
{
    int eid;
    String eName;
    int eSal;
    String eDept;
    String eAddr;

    public Employee(int eid, String eName, int eSal, String eDept, String eAddr) {
        this.eid = eid;
        this.eName = eName;
        this.eSal = eSal;
        this.eDept = eDept;
        this.eAddr = eAddr;
    }

    public Employee() {
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Executing writeExternal Method");
        out.writeObject(eName);
        out.writeObject(eDept);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Executing readExternal Method");
        eName =(String)in.readObject();
       // eDept = (String)in.readObject();
    }
    void disp()
    {
        System.out.println(eName+ " " + eAddr+ " " + eDept + " " + eid + " " + eSal );
    }
}
public class LaunchExternalisation12
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        File f = new File("em.txt");
//
//        FileOutputStream fos = new FileOutputStream(f);
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        ObjectOutputStream oos = new ObjectOutputStream(bos);
//
//        Employee e = new Employee(101,"ram",7000,"dev","ameerpet");
//        oos.writeObject(e);
//        System.out.println("Externalisation completed");
//        oos.close();

        File f = new File("E:\\Milestone3onjava\\em.txt");

          FileInputStream fis = new FileInputStream(f);
          BufferedInputStream bis = new BufferedInputStream(fis);
          ObjectInputStream ois = new ObjectInputStream(bis);

        Employee em = (Employee)ois.readObject();
        em.disp();

        ois.close();
    }
}



/*
ram null null 0 0
 */