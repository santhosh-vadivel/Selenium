package com.santhosh;

public class IfElseConcept {
    public static void main(String[] args){
        int a=30;
        int b=20;

        //if conditional statement
        // comparision operator: <, >, <=, >=, ==, !=
        if(a>b){ // this will always be a boolean condition, if TRUE, the control goes inside. OR it goes to the else block
            System.out.println("A is Greater");
        }else{
            System.out.println("B is Greater");
        }//else


        int c=100;
        int d=600;
        int e=300;
        
        if(c>d & c>e){
            System.out.println("C is greatest of all");
        }else if(d>e){
            System.out.println("D is greatest of all");
        }else{
            System.out.println("E is greatest of all");
        }//else
    }//main
}//class
