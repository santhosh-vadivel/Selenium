package com.santhosh;

public class ArrayConcepts {

    /*disadvantages os this static array: 1 dimensional arrays
     size is fixed => to overcome this issue, we can use ArrayList or HashTable (dynamic arrays
     able to store only similar data types => to overcome this issue, we can use object array
    */

    public static void main(String[] args) {

        //static array: to store similar data types
        int i[] = new int[4];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        System.out.println("Value of first array element: "+i[0]);
        System.out.println("Size of array: "+i.length);

        for(int n=0;n<i.length;n++){
            System.out.println("The elements in array are:"+i[n] );
        }//for

        //System.out.println("Value of first array element: "+i[4]); //exceeds the n-1 limit of array. //ArrayIndexOutOfBoundsException
        
        //Like int array, we can create double, char, boolean & String array also.
        String stringarray[] = new  String[4]; //Size is fixed in an array
        stringarray[0] = "Santhosh";
        stringarray[1] = "Vadivel";
        stringarray[2] = "is a Boss";
        System.out.println("The string array\'s length is: " + stringarray.length);


        //Object arrays are used to store different data types
        Object ob[] = new Object[3];
        ob[0] = "Santhosh";
        ob[1] = "V";
        ob[2] = "27";

        for(int o=0; o<ob.length; o++){
            System.out.println("The elements in object arrays are: "+ob[o]);
        }//for
    }//main    
}//class
