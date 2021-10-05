package Inheritance;

class BaseStudent{
    String name;
    int roll;

    void displayStudent(){
        System.out.println(name+" "+roll);
    }
}

class CR extends BaseStudent{
    String typeofCR;

    void displayStudentCR(){
        this.displayStudent();
        System.out.println(" "+typeofCR);
    }
}
public class basic2 {
    public static void main(String[] args){
        CR cr1=new CR();
        cr1.roll=12;
        cr1.name="Something";
        cr1.typeofCR="tech";
        cr1.displayStudentCR();
    }
}
