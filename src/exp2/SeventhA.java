package exp2;
//7. Consider a hierarchy, where a sportsperson can either be an athlete or a hockey player. Every sportsperson has
//        a unique name. An athlete is characterized by the event in which he/she participates; whereas a hockey player is
//        characterized by the number of goals scored by him/her. Perform the following tasks using Java :
//
//        (i)Create the class hierarchy with suitable instance variables and methods.
//        (ii) Create a suitable constructor for each class.
//        (iii) Create a method named display_all_info with suitable parameters. This method should display all the
//        information about the object of a class.
//        (iv) Write the main method that demonstrates
//        polymorphism i.e. methods with same name in the subclasses as the head class
class sportsman{
    String sName;
    void display_all_info(){}
    sportsman(String sName){
        this.sName=sName;
    }
}
class athlete extends sportsman{
    String event;
     void display_all_info(){
         System.out.println("Name: "+sName+"\nEvent: "+event);
     }
    athlete(String sName,String event){
         super(sName);
         this.event=event;
    }
}
class hockey extends sportsman{
    int hGoals;
    void display_all_info(){
        System.out.println("Name: "+sName+"\nGoals: "+hGoals);
    }
    hockey(String sName,int hGoals){
        super(sName);
        this.hGoals=hGoals;
    }
}
public class SeventhA {
    public static void main(String[] args){
        sportsman s1=new sportsman("Kate");
        sportsman s2=new sportsman("Tack");
        athlete a1=new athlete("Giu","Short put");
        athlete a2=new athlete("Sam","Edits");
        hockey h1=new hockey("Wren",91);
        hockey h2=new hockey("Peter",80);
        s1.display_all_info();
        s2.display_all_info();
        a1.display_all_info();
        a2.display_all_info();
        h1.display_all_info();
        h2.display_all_info();
    }
}
