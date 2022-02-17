package Polymorphism.Runtime;

public class Bike {
    void run(){
        System.out.println("running");
    }
}

class Splendor extends Bike{
    void run(){
        System.out.println("running safely with 60km/hr");
    }

    public static void main(String[] args) {
        Bike b = new Splendor();
        //run method of splendor overrides bike at run time
        //because run method is called by reference variable of parent class
        //it refers to subclass(splendor) object
        b.run();
    }
}
