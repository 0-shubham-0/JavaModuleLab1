package Basics;

public class useNestedClass {
    private int a=30;
    class Inner{
        void msg(){
        System.out.println("a is "+a );
    }
    }
    static void msg2(){
        //System.out.println(a); can't use
        System.out.println(30);
    }
    public static void main(String[] args){
        useNestedClass obj=new useNestedClass();
        useNestedClass.Inner in= obj.new Inner();
        in.msg();
        useNestedClass.msg2();
    }
}
