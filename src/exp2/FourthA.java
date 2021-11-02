package exp2;
//4. Create a class Book and
// define a display method to display
// book information.
// Inherit Reference_Book
// and Magazine classes from
// Book class
// and override display method of Book class
// in  Reference_Book and Magazine classes.
// Make necessary assumptions required.

abstract class Book{
    String name="NULL";
    int serialNo=0;
    void setBookInfo(String a,int b){
        name=a;
        serialNo=b;
    }
    void display(){
        System.out.println("Name of book is "+name+"\n Serial no. is "+serialNo);
    }
}
class referenceBook extends Book{
    String category;

    void setBookInfo(String a, int b,String cat) {
        super.setBookInfo(a, b);
        category=cat;
    }

    void display(){
        System.out.println("Name of the Reference "+name+"\nSerial no. "+serialNo+"\nCategory "+category);
    }
}
class magazine extends Book{
    String publisher;
    void setBookInfo(String a, int b,String p) {
        super.setBookInfo(a, b);
        publisher=p;
    }
    void display(){
        System.out.println("Name of the Reference "+name+"\nSerial no. "+serialNo+"\nPublisher "+publisher);
    }
}
public class FourthA {
    public static void main(String[] args){
        referenceBook b2=new referenceBook();
        b2.setBookInfo("dwa",323,"Science");
        magazine b3=new magazine();
        b3.setBookInfo("ddad",223,"Vogue");
        b2.display();
        b3.display();
    }
}
