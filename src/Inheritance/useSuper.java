package Inheritance;
class studentDetails{
    String name;
    int id;

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
}
class studentAdd extends studentDetails{
    String address;
    studentAdd(String a){
    super(a);//can only be used in constructors
    }
}
public class useSuper {
}
