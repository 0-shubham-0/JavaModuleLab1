package Projects;

/*
Five Projects.Bikers Compete in a race such that they drive at
a constant speed which may or may not be the same as
the other. To qualify the race, the speed of a racer must
be more than the average speed of all 5 racers. Write a
Java program to take as input the speed of each racer
and print back the speed of qualifying racers.
 */
public class Bikers {
    public static void main(String[] args) {
        int a[]=new int[5];
        a[0]=100;
        a[1]=200;
        a[2]=150;
        a[3]=120;
        a[4]=100;

        float r1=100,r2=200,r3=150,r4=120,r5=100,avg;
        avg = (r1+r2+r3+r4+r5)/5;
        System.out.println("Average is = " + avg);
        /*if (r1> avg)
            System.out.println("Racer R1 qualified");
        if (r2> avg)
            System.out.println("Racer R2 qualified");
        if (r3> avg)
            System.out.println("Racer R3 qualified");
        if (r4> avg)
            System.out.println("Racer R4 qualified");
        if (r5> avg)
            System.out.println("Racer R5 qualified");*/
        for(int i = 0; i<4;i++){
            if(a[i]>avg)
                System.out.println("Racer R" + (i+1) + " qualified");

        }
    }
}
