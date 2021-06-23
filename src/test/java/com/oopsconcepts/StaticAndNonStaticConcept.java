package com.oopsconcepts;

public class StaticAndNonStaticConcept {

    static int age = 27;
    String name = "Santhosh";

    public static void main(String[] args){
        //calling non static methods.
        StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
        obj.sum();

        //calling non static variables
        StaticAndNonStaticConcept obj1 = new StaticAndNonStaticConcept();
        System.out.println("The non stativ variable is: " +obj1.name);  

        //calling static methods without creating object reference variable for class
        printLine(); //direct method call
        StaticAndNonStaticConcept.printLine(); //method call using class name

        // calling static method using obj ref variable is also allowed, but no use of it.
        //obj.printLine();

        //calling static variables
        System.out.println("The static variable is: " + age);
        System.out.println("The static variable is: " + StaticAndNonStaticConcept.age);
    }//main

    public void sum(){
        System.out.println("Non static sum method");
    }

    public static void printLine(){
        System.out.println("Static method");
    }
}//class