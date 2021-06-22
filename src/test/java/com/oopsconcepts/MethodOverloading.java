package com.oopsconcepts;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.sum();
        obj.sum(20);
        obj.sum(12.32);
        obj.sum(10, 30);
    }//main

    //We can overload main method too
    // public static void main(int a) {
    //     System.out.println("The value of a is:");
    // }//main

    //We can't create method inside another method
    //Method overloading can be acheived through multiple data types or multiple arguements
    public void sum(){
        System.out.println("No arguments sum method");
    }//sum

    public void sum(int a){
        System.out.println("One integer arguments sum method");
    }//sum

    public void sum(double a){
        System.out.println("One double arguments sum method");
    }//sum

    public void sum(int a, int b){
        System.out.println("Two integer arguments sum method");
    }//sum

}//class