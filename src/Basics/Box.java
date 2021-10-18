package Basics;

class Box {
    double weight;
    double depth;
    double length;
    double width;

    double volume(){

        return width*depth*length;
    }
    Box(){
        weight=1;
        depth=1;
        length=1;
        width=1;
    }
    Box(Box ob){
        weight=ob.weight;
        depth=ob.depth;
        length=ob.length;
        width=ob.width;
    }
}