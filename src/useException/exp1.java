package useException;
/*Create an interface vehicle and classes like bicycle,car, bike etc, having common functionalities and put
all the common functionalities in the interface.
Classes like Bicycle, Bike, car etc implement all these functionalities in their own class in their own
way*/
interface vehicle{
    public void wheels();
    public void seats();
}
class bicycle implements vehicle{
    int wheel=2,seat=1;
    public void wheels(){
        System.out.println("No of wheels "+wheel);
    }
    public void seats(){
        System.out.println("No of seats "+seat);
    }
}
class bike implements vehicle{
    int wheel=2,seat=2;
    public void wheels(){
        System.out.println("No of wheels "+wheel);
    }
    public void seats(){
        System.out.println("No of seats "+seat);
    }
}
class car implements vehicle{
    int wheel=4,seat=4;
    public void wheels(){
        System.out.println("No of wheels "+wheel);
    }
    public void seats(){
        System.out.println("No of seats "+seat);
    }
}
public class exp1 {
    public static void main(String[] args){
        bicycle v1 = new bicycle();
        bike v2 = new bike();
        car v3 = new car();
        System.out.println("Bicycle");
        v1.wheels();v1.seats();
        System.out.println("/nBike");
        v2.wheels();v2.seats();
        System.out.println("/nCar");
        v3.wheels();v3.seats();
    }
}
