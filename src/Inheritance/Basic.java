package Inheritance;
class A{
    int i,j;
    void show_ij(){
        System.out.println("i and j "+i+j);
    }
}
class B extends A{//b can access a
    int k;

    void showK(){
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
        superObj.show_ij();

        //subOjb can access attributes of A
        subObj.i=10;
        subObj.j=20;
        subObj.k=30;
        subObj.showK();
        subObj.sum();
    }
}