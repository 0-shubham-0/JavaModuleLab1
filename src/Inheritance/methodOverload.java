package Inheritance;

class parent{
    int uses=12;
    void print(){
        System.out.println(uses);
    }
}
class child extends parent{
    int uses=11;
    void print(){
        System.out.println(uses);
        super.print();
    }
}
class grandchild extends child{
    int uses=2;
    void print(){
        System.out.println("\n"+uses);
        super.print();//interestingly calls both parent and child
        System.out.println(super.uses);//calls only immediate parent
    }
}
public class methodOverload{
    public static void main(String []args){
        parent obj1=new parent();
        child obj2=new child();
        grandchild obj3=new grandchild();
        obj2.print();//call only child's method
        obj1.print();//call parent's print
        obj3.print();
    }
}
