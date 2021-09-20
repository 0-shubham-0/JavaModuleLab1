class Box {
    double weight;
    double depth;
    double length;
    double width;
}

public class useClassAndObject {
    public static void main(String[] args) {
        // Create Object of Class
        Box a = new Box();

        a.depth=10;
        a.weight=100;
        a.length=10;
        a.width=10;

        Box b = new Box();

        b.depth=10;
        b.weight=100;
        b.length=10;
        b.width=10;

        double volume = a.depth*a.width*a.length;
        double volume1 = b.depth*b.width*b.length;

        System.out.println("Volume is " + volume);
        System.out.println("Volume is " + volume1);

    }
}
