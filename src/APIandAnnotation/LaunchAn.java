package APIandAnnotation;
@FunctionalInterface
interface Demo
{
    void disp();
    // void disp1();  CE because we are using @FunctionalInterface
}

// This is parent class
class Plane
{
    public void planeFliesAtGoodHeight()
    {
        System.out.println("Plane is flying");
    }
}
//This is child class
class CargoPlane extends Plane
{
/*    @Override
    public void planeFliesATGoodHeigt() {
        System.out.println("CargoPlane flies at low height");
    }

    if @Override is used above a method then you much override it correctly otherwise compile time error occur.
 */
    @Override
    public void planeFliesAtGoodHeight() {
        System.out.println("CargoPlane flies at low height");
    }
}
public class LaunchAn
{
    public static void main(String[] args)
    {
        //object of child class
        Plane cp = new CargoPlane();
        cp.planeFliesAtGoodHeight();
    }
}
