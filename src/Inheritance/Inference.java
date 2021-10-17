package Inheritance;

//Basically makes the inheritance useless

class mainClass{
    int i;
}
class firstDerived extends mainClass{
    int j;
}
class secondDerived extends firstDerived{
    int k;
}

class call{
     static mainClass getobj(int a){
        switch(a){
            case 0: return new mainClass();
            default: return new secondDerived();
        }
    }
}
public class Inference {
    public static void main(String []args){

    }
}
