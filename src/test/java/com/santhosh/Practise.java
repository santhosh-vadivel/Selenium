package com.santhosh;

public class Practise {
    int studentId = 123;
    String studentFirstName = "Santhosh", studentLastName = "Vadivel";
}//class

class PractiseAnother{
    public static void main(String[] args){
        Practise P = new Practise();
        System.out.println("The student name is:" + P.studentId);
        System.out.println("The student first name is:" + P.studentFirstName);
        System.out.println("The student second name is:" + P.studentLastName);
    }//main
}//PractiseAnother
