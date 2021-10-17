package Inheritance;

//to stop inheritance
class head{}
class tail extends head{}

final class head2{}
//class tail2 extends head2{} can't make subclass of final

class head3{
    final void hair(){}
}
class tail3 extends head3{
    //void hair(){} can't use hair since its final
}

public class useFinal {
    public static void main(String []args){
        var obj=new head();
    }
}
