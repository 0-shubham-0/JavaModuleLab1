package Inheritance;
class studentDetails{
    String name;
    int id;
    private int specialid=212;

    studentDetails(){
        name="NULL";
        id=0;
    }
    studentDetails(String a){
        name=a;
        System.out.println("Name is "+name);
    }
    studentDetails(String a,int b){
        name=a;
        id=b;
        System.out.println("Name is "+name+" and id:"+id);
    }
    void print(){
        System.out.println(name+" "+specialid);
    }
}
class studentAdd extends studentDetails{
    String address;
    studentAdd(String a){
        super(a);//can only be used in constructors
    }
    void getSID(){
        super.print();
    }
}
public class useSuper {
    public static void main(String []args){
        studentDetails s1=new studentDetails("Jane");
        studentDetails s2=new studentDetails("Doe",22);
        s1.print();
        studentAdd s3=new studentAdd("John");//uses super to pass name
        s3.getSID();//uses super to print private var
    }
}
