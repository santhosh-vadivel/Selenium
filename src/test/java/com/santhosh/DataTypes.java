package com.santhosh;

public class DataTypes {
    public static void main(String[] args){

        //the below are primitive data type
        int i = 10;
        System.out.println("Value of i is:" +i );
        i = -20; // changing the value of i here, but cant assign duplicate variable.

        double j = 20; // 20.0

        char k = '1'; //single digit value : should be in single quotes

        boolean b1 = true;
        boolean b2 = false;

        //string is a class, not a data type
        String s1 = "santhosh";
        String s2 = "1000";
        String s3 = "10.6";

        System.out.println("Value of i is:" +i+ "\nchanged Value of i is: " +j+ " \nValue of K: " +k + "\nValue of b1: " +b1+ 
        " \nValue of b1: "+b2 + "\nValue of string are:\n" + s1+"\n"+s2+"\n"+s3);
    }
}
