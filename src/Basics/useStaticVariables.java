package Basics;

public class useStaticVariables {
    //int count=0;
    static int count=0;
    useStaticVariables(){
        count++;
        System.out.println(count);
    }
    public static void main(String args[]){
        useStaticVariables c1=new useStaticVariables();
        useStaticVariables c2=new useStaticVariables();
        useStaticVariables c3=new useStaticVariables();
        System.out.println(count);
    }
}
