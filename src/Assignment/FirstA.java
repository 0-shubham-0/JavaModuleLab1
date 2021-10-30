package Assignment;

//1. Create a Java based application to perform
// various ways of Method overloading.
// i.e. No parameters, types of parameters,
// Constructor Overloading
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
    void print(String address1){
        System.out.println("Address of "+name+" is "+address1);
    }
}
public class FirstA {
    static int addition(int x, int y) {
        return x + y;
    }
    static double addition(double x, double y) {
        return x + y;
    }
    public static void main(String[] args)
    {
        studentDetails s1=new studentDetails("Jane");
        studentDetails s2=new studentDetails("Doe",22);
        studentDetails s3=new studentDetails();
        s1.print();
        s2.print();
        s3.print();
        s1.print("Kurla");
        s2.print("Mumbai");
    }
}
