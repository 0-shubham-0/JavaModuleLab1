package useException;
/* Java Program to Create Account with 1000 Rs Minimum Balance, Deposit Amount, Withdraw
Amount and Also Throws LessBalanceException.
It has a Class Called LessBalanceException Which returns the Statement that Says WithDraw Amount(_Rs) is Not Valid.
It has a Class Which Creates 2 Accounts, Both Account Deposite Money and One Account Tries to
WithDraw more Money Which Generates a LessBalanceException Take Appropriate Action for the
Same*/
class LessBalanceException extends Throwable {
    public LessBalanceException(int num)
    {
        // throw an object of user defined exception
        System.out.println("WithDraw Amount Rs "+num+" is Not Valid.");
    }
}
class account{
    int balance=1000;
    void deposit(int amount){
        balance+=amount;
        System.out.println("Amount "+amount+" deposited.");
    }
    void withdraw(int amount){
        try {
            if (amount>balance)
                throw new LessBalanceException(amount);
            balance-=amount;
            System.out.println("Amount "+amount+" withdrawn.\nCurrent balance "+balance);
        }catch (LessBalanceException bal){}
    }
}
public class exp3 {
    public static void main(String[] args){
        account a1=new account();
        account a2=new account();
        System.out.println("Account no.1");
        a1.deposit(1000);
        System.out.println("Account no.2");
        a2.withdraw(2000);
    }
}
