package Inheritance;
//makes it so that there is always a class which needs to be overridden
abstract class shape{
    int l1,l2;
    shape(){}
    abstract void property();//abstract method
    shape(int var1,int var2){//can have concrete methods
        l1=var1;
        l2=var2;
    }
}
class square extends shape{
    square(int a){
        super(a,a);
    }
    square(){}
    @Override
    //override property since its necessary or else will give error
    void property() {
        System.out.println("Area is "+l1*l2);
    }
}
class something extends square{} //abstract can't have multiple inheritance
public class abstractClass {
    public static void main(String []args){
        square s1=new square(4);
        //shape s2=new shape(); cannot instantiate since its a abstract class
    }
}
