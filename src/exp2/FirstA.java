package exp2;

//1. Create a Java based application to perform
// various ways of Method overloading.
// i.e. No parameters, types of parameters,
// Constructor Overloading
class studentDetails{
    String name;
    int id;
    int age;

    studentDetails(){
        name="NULL";
        id=0;
        age=0;
    }
    studentDetails(String name){
        this.name=name;
        System.out.println("Name is "+this.name);
    }
    studentDetails(int id){
        this.id=id;
    }
    studentDetails(String name,int id){
        this.name=name;
        this.id=id;
        System.out.println("Name is "+name+" and id:"+this.id);
    }
    void print(int a){
        System.out.println(name+" "+id);
    }
    void print(double a){
        System.out.println("Name : "+name+"\nId is "+id+"\nAge is "+age);
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
        studentDetails s4=new studentDetails(23424);
        s1.print(2);
        s2.print(2.3);
        s3.print(4);
        addition(2,3);
        addition(2.33,3.44);
    }
}
