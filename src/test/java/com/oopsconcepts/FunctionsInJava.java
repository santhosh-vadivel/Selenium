package com.oopsconcepts;

public class FunctionsInJava {
    public static void main(String[] args){

        //We nede to create an object to call a non static method
        FunctionsInJava FIJ = new FunctionsInJava();
        FIJ.test();

        int qa = FIJ.qa();
        System.out.println(qa);

        String s1 = FIJ.developer();
        System.out.println(s1);

        int div = FIJ.approver(100, 200);
        System.out.println(div);
    }//main

    //non static methods

    public void test(){ //no input, no output
        System.out.println("This is a test method with no return type");
    }//test

    public int qa(){ //no input, some output
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println("This is a qa method with integer return type");

        return c;
    }//qa

    public String developer(){ //no input, some output
        String s = "Selenuim";
        System.out.println("This is a developer method with string return type");

        return s;
    }//qa

    public int approver(int x, int y){ //some input, some output
        int z = x+y;
        System.out.println("This is a developer method with int return type");

        return z;
    }//qa
}//class