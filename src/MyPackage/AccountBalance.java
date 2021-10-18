package MyPackage;

public class AccountBalance {
    public static void main(String []args){
        Balance current[]=new Balance[3];

        current[0]=new Balance("Sam",100);
        current[1]=new Balance("Ban",10);
        current[2]=new Balance("Mac",1200);
        for (int i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}
