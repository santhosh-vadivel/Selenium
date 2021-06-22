package com.santhosh;

public class LoopsConcept {
    public static void main(String[] args){

        //FOR loop
        for(int i=0; i<=10;i++){
            System.out.println("The value of i is:"+ i);
        }//incremental for

        for(int j=10; j>=1;j--){
            System.out.println("The value of i is:"+ j);
        }//decremental for


        //WHILE Loop
        int a = 0;
        while(a<=10){
            System.out.println("While Loop: The value of a is:" +a);
            a++; // this is must, else the loop will run unconditionally
        }//while
    }//main
}//class
