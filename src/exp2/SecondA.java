package exp2;

class student {
    String name,address;
    int id;
    student(){
        name="NULL";
        id=0;
        address="NULL";
    }
    student(String a){
        this();
        name=a;
    }
    student(String a, int b){
        this(a);
        id=b;
    }
    student(String a,int b,String c){
        this(a,b);
        address=c;
    }
    void print(){
        System.out.println("Name is "+name+" id is "+id+"Address is "+address);
    }
}
public class SecondA {
    public static void main(String[] args){
        student s1=new student("Jake");
        student s2=new student("Alan",12);
        student s3=new student("Tam",22,"Place");
        s1.print();
        s2.print();
        s3.print();
    }
}
