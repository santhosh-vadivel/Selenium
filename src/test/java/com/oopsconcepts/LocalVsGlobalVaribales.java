package com.oopsconcepts;

public class LocalVsGlobalVaribales {
    
    String name = "Santhosh"; //global scope
    int i = 10; //global scope

    public static void main(String[] args){
        int i = 10;
        System.out.println("Value of i inside main method: " +i);

        LocalVsGlobalVaribales obj = new LocalVsGlobalVaribales();
        obj.anotherMethod();
        obj.anotherMethod1();

        // to print the global variable, we need to create object for the class and call the global variable via the class
        System.out.println("The global string is: "+ obj.name);
        System.out.println("The global int is: "+ obj.i);
    }//main

    public void anotherMethod(){
        int i = 15;
        System.out.println("Value of i inside anotherMethod: " +i);
    }//anotherMethod

    public void anotherMethod1(){
        int i = 16;
        System.out.println("Value of i inside anotherMethod1: " +i);
    }//anotherMethod1
}//class