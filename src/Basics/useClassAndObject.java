package Basics;

public class useClassAndObject {
    public static void main(String[] args) {
        // Create Object of Class
        Box a = new Box();

        a.depth=10;
        a.weight=100;
        a.length=10;
        a.width=10;
        Box b= new Box(a);//passing object

        Box c = new Box();

        c.depth=10;
        c.weight=100;
        c.length=10;
        c.width=10;

        double volume = a.depth*a.width*a.length;
        double volume1 = c.depth*c.width*c.length;

        System.out.println("Volume is " + volume);
        System.out.println("Volume is " + volume1);

    }
}
