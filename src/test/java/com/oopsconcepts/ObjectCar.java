package com.oopsconcepts;

public class ObjectCar {
    //declare the class variables
    String mod;
    int wheel;

    public static void main(String[] args) {

        //new Car() is the object
        // a,b,c are the reference variables for the object

        ObjectCar a = new ObjectCar();
        ObjectCar b = new ObjectCar();
        ObjectCar c = new ObjectCar();

        a.mod = "BMW-X1";
        a.wheel = 4;

        b.mod = "BMW-X6";
        b.wheel = 4;

        c.mod = "BMW-X9";
        c.wheel = 4;

        System.out.println("Before shifting the references");

        System.out.println(a.mod);
        System.out.println(a.wheel);

        System.out.println(b.mod);
        System.out.println(b.wheel);

        System.out.println(c.mod);
        System.out.println(c.wheel);

        System.out.println("After shifting the references");
        a = b; 
        b = c;
        c = a;

        a.mod = "BMW-X1";
        System.out.println(a.mod);

        c.mod = "BMW-X9";
        System.out.println(c.mod);
        System.out.println(a.mod);
    }//main
}//class