package MyPackage;

public class Balance {
    String name;
    double num;

    Balance(String n,double b){
        name=n;
        num=b;
    }

    void show(){
        if(num<0)
            System.out.println("-->");
        System.out.println(name + num);
    }
}
