package Inheritance;

class AA{
    int i;
    private int j;
    void setij(int x,int y){
        i=x;
        j=y;
        System.out.println(i+" "+j);
    }
}
class BB extends AA{
    //int a=j; j is a private variable which cant be used here

}
public class usePrivate {
    public static void main(String args[]) {
        AA obj1=new AA();
        BB obj2=new BB();
        //obj2.j=2; objects cant use private variables
        obj1.setij(2,4);

    }
}
