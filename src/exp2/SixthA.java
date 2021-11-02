package exp2;

import java.util.Scanner;

//6. An employee works in a particular department of an organization. Every employee has an employee number,
//        name and draws a particular salary. Every department has a name and a head of department. The head of
//        department is an employee. Every year a new head of department takes over. Also, every year an employee is
//        given an annual salary enhancement. Identify and design the classes for the above description with suitable
//        instance variables and methods. The classes should be such that they implement information hiding. You must
//        give logic in support of your design. Also create two objects of each class.
class Employee{
    protected int eNumber;
    protected String eName;
    protected int eSalary;
    Employee(int eNumber,String eName,int eSalary){
        this.eNumber=eNumber;
        this.eName=eName;
        this.eSalary=eSalary;
    }
    void salaryIncrement(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Initial Salary : "+eSalary+"\nHow much do you want to increment? ");
        int eSalary=sc.nextInt();
        this.eSalary+=eSalary;
        System.out.println("New Salary : "+this.eSalary);
    }
}
class head extends Employee{
    private final String depName;
    head(int eNumber,String eName,int eSalary,String depName){
        super(eNumber,eName,eSalary);
        this.depName=depName;
    }
    void eUpadate(int eNumber,String eName,int eSsalary){
        this.eNumber=eNumber;
        this.eName=eName;
        this.eSalary=eSsalary;
    }
}

public class SixthA {
    public static void main(String[] args){
        Employee e1=new Employee(2342324,"James",30_000);
        Employee e2=new Employee(2342234,"Olive",21_000);
        head h1=new head(2342224,"John",40_000,"Service");
        head h2=new head(1342224,"Sean",41_000,"Transport");

        /*Year has passed*/
        e1.salaryIncrement();
        e2.salaryIncrement();
        h1.eUpadate(2342224,"Jonas",40_000);
        h1.eUpadate(2342224,"Tail",41_000);
    }
}
