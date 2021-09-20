class marks{
    double math;
    double chem;
    double phys;
    double cp;
}

public class Student {
    public static void main(String[] args){
        marks m = new marks();
        m.chem=90;
        m.cp=80;
        m.phys=99;
        m.math=70;

        double avg = (m.chem + m.cp + m.math + m.phys)/4;
        System.out.println("Your average is "+ avg);
    }
}
