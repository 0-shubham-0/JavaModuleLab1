package Inheritance;
class A{
    int i,j;
    void showij(){
        System.out.println("i and j "+i+j);
    }
}
class B extends A{//b can access a
    int k;

    void showk(){
        System.out.println("k is "+k);
    }
    void sum(){
        System.out.println("i+j+k"+(i+j+k));
    }
}
public class Basic {
    public static void main(String[] args){
        A superObj=new A();
        B subObj=new B();

        superObj.i=10;
        superObj.j=20;
        System.out.println(superObj.i+superObj.j);
        superObj.showij();

        //subOjb can access attributes of A
        subObj.i=10;
        subObj.j=20;
        subObj.k=30;
        subObj.sum();
    }
}