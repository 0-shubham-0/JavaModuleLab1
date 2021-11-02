package useException;

import java.util.Scanner;
class OddException extends Throwable {
    public OddException(int num)
    {
        // throw an object of user defined exception  
        System.out.println("Even number"); 
    }
}
public class excepHandle extends OddException{
    public excepHandle(int num) {
        super(num);
    }

    public static void main(String args[])  {
        
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        scan.close(); 
        try  {  
            if(number%2==0)
            throw new OddException(number);
            // throw an object of user defined exception  
        }  
        catch (OddException ex)  {  
            System.out.println("Caught the exception");  
        }

        System.out.println("Program runs successfully");  
    }    
}



