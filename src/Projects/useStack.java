package Projects;

import java.util.Scanner;

public class useStack {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Size of stack : ");
        int size = scan.nextInt();
        Stack stack = new Stack(size);

        while (true){
            System.out.println("Enter 1,2,3,4 for:\n1. Push\n2.Pop\n3.Display\n4.Exit");
            byte ch=scan.nextByte();
            switch (ch){
                case 1:{
                    System.out.println("Enter element to be pushed");
                    int temp=scan.nextInt();
                    stack.push(temp);
                    break;
                }
                case 2:{
                    stack.pop();
                    break;
                }
                case 3:{
                    stack.display();
                    break;
                }
                case 4:{
                    System.exit(1);
                    break;
                }
                default:
                    System.out.println("Enter a valid number\n");
            }
        }
    }
}
