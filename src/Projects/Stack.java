package Projects;

public class Stack {
        int arr[];
        int top;
        int capacity;

        // Constructor
        Stack(int size) {
                arr = new int[size];
                capacity = size;
                top = -1;
        }
        public void push(int x){
                if(isFull())
                        System.out.println("Projects.Stack is full/overflow");
                else {
                        System.out.println("Element " + x + " is inserted.");
                        arr[++top]=x;
                }
        }
        public void pop(){
                if (isEmpty())
                        System.out.println("Projects.Stack is empty");
                else
                        System.out.println(arr[top--]+" is Popped");

        }

        public Boolean isEmpty()
        {
                return top == -1;               // or return size() == 0;
        }

        // Utility function to check if the stack is full or not
        public Boolean isFull() {
                return top == capacity - 1;     // or return size() == capacity;
        }

}
