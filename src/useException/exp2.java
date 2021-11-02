package useException;

import java.util.Scanner;
import java.util.regex.*;
/*Write java program where user will enter loginid and password as input.
The password should be 8 digit containing one digit and one special symbol.
If user enter valid password satisfying above criteria then show “Login Successful Message”.
If user enter invalid Password then create InvalidPasswordException stating Please enter valid password of length 8 containing one digit and one Special Symbol.*/


class InvalidPasswordException extends Throwable {
    public InvalidPasswordException()
    {
        // throw an object of user defined exception
        System.out.println("Please enter valid password of length 8 containing one digit and one Special Symbol.");
    }
}
public class exp2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter login id : ");
        String id=sc.next();
        System.out.print("Enter Password : ");
        String pass=sc.next();
        String regex = "(?=.*?\\d)(?=.*?[a-zA-Z])(?=.*?[^\\w]).{8,}";
        try {
            if(!pass.matches(regex)){
                throw new InvalidPasswordException();
            }
            System.out.println("Password is valid");
        }catch (InvalidPasswordException in){
            System.out.println("Caught the exception");
        }

        //rest of the code
    }
}
