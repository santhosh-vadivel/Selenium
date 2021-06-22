package com.santhosh;

public class StringConcatenation {
    public static void main(String[] args){
        // + is a concatenation operator
        int a = 100;
        int b = 200;

        double d1 = 20.10;
        double d2 = 39.20;

        String x = "Hello";
        String y = "World";

        String z = x+y;
        //concatenation happens left to right
        String result = a+b+x+y; //300HelloWorld
        String result1 = x+y+a+b; //HelloWorld100200
        String result2 = (x+y+(a+b)); //HelloWorld300
        String result3 = (a+b+x+y+a+x+b+y); //300HelloWorld100Hello200World
        String result4 = (d1+d2+x+y); //59.30HelloWorld
        String result5 = (x+y+d1+d2); //HelloWorld20.139.2


        System.out.println("The concatenated string is: " + z + "\n" + "The result value is: " + result+ "\n" 
            + "The result value is: " + result1+ "\n" 
            + "The result value is: " + result2+ "\n" 
            + "The result value is: " + result3+ "\n" 
            + "The result value is: " + result4+ "\n"
            + "The result value is: " + result5+ "\n");
    }
}
