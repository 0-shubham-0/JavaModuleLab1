package Projects;

/*
Pooja would like to withdraw X $US from an Projects.ATM.
The cash machine will only accept the transaction if X
is a multiple of 5, and Pooja's account balance has enough
cash to perform the withdrawal transaction
(including bank charges).
For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an
 attempted transaction.
*/
public class ATM {
    public static void main(String[] args) {
        float x,am=10000;
        x=500;
        if(x % 5 == 0){
            if(x>am-0.5f)
                System.out.println("not enough money="+am);
            else
            {
                am= am - x-0.5f;
                System.out.println("Account balance= "+ am);}
        }
        else
            System.out.println("withdraw value should be multiple of 5. Account balance= " + am);
    }
}
