package com.santhosh;

public class TwoDimArray {
    public static void main(String[] args) {
        String x[][] = new String[3][5];
        System.out.println("The total rows in the array is: "+x.length);
        System.out.println("The total rows in the array is: "+x[0].length);

        x[0][0] = "A";
        x[0][1] = "B";
        x[0][2] = "C";
        x[0][3] = "D";
        x[0][4] = "E";

        x[1][0] = "F";
        x[1][1] = "G";
        x[1][2] = "H";
        x[1][3] = "I";
        x[1][4] = "J";

        x[2][0] = "K";
        x[2][1] = "L";
        x[2][2] = "M";
        x[2][3] = "N";
        x[2][4] = "O";

        for(int row=0; row<x.length;row++){
            for(int column = 0; column<x[0].length; column++){
                System.out.println(x[row][column]);
            }//column for
        }//row for
    }//main
}//class
