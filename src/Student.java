class marks{
    double math;
    double chem;
    double phys;
    double cp;

    double avg(){
        return (chem + cp + math + phys)/4;
    }
    void mark(double a, double b,double c,double d){
        math = a;
        chem = b;
        phys = c;
        cp = d;
    }
}

public class Student {
    public static void main(String[] args){
        marks m = new marks();
//        m.chem=90;
//        m.cp=80;
//        m.phys=99;
//        m.math=70;
          m.mark(90,50,80,99);

        double avg1 = m.avg();
        System.out.println("Your average is "+ avg1);
    }
}
