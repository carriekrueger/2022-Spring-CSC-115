// Carrie Krueger
// 4-27-21
// All about arrays 

public class ArrayNotes {
    public static void main(String[] args) {
      
      
        /* template
        
              0   1   2   3   4   5   6
            -----------------------------
            | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
            -----------------------------
        */ 

        // ARRAY RULES:

        // 1. You need to know the size of the array when you declare it.
        // 2. Once the array is created, you can't change the size (can't resize an array)
        // 3. Arrays can only hold one type of data at a time (all Strings, all ints, etc.)
        // Arrays are indexed from 0 to length - 1 (ArrayIndexOutOfBounds error)

        // Let's make an array to hold daily temperatures for a week

        int[] temps = new int[7];   // DECLARE an array of 7 ints (length is 7)

        /*
        
              0   1   2   3   4   5   6        positions/indexes 0 to length - 1
            -----------------------------
            | 0 | 0 | 0 | 0 | 0 | 0 | 0 |      initially filled with 0s
            -----------------------------
        */ 

        // loading the array with values

        temps[0] = 29;
        temps[1] = 31;
        temps[2] = 41;
        temps[3] = 16;
        temps[4] = 30;
        temps[5] = 30;
        temps[6] = 30;



        /*
        
              0     1    2    3    4   5    6        
            ------------------------------------
            | 29 | 31 | 41 | 16 | 30 | 30 | 30 |      
            ------------------------------------
        */ 

        System.out.println(temps[3]); // 16

        // can do anything with array elements that you can do with regular variables
        double weekendAverage = (temps[0] + temps[1])/2.0;
        System.out.println(weekendAverage); // 30.0


        temps[3] = 26;  // no output, just changes the array

        /*
        
              0     1    2    3    4   5    6        
            ------------------------------------
            | 29 | 31 | 41 | 26 | 30 | 30 | 30 |      
            ------------------------------------
        */ 

        System.out.println(temps[3]); // 26
        
        // print the first element in array: position 0 

        System.out.println("First: " + temps[0]);

        // print last element in this array: position 6 (7th element)

        System.out.println("Last: " + temps[6]);

        // position 7? 

        //System.out.println(temps[7]);  // ArrayIndexOutOfBounds Exception 

        // print the last element in any array? position length - 1

        System.out.println("Last: " + temps[temps.length - 1]);

        // how to print entire array? 

        System.out.println(temps); // prints memory address 

        // use a for loop to print every element in the array

        for(int i = 0; i < temps.length; i++) {
            System.out.print(temps[i] + " ");
        }

        System.out.println();  // so the next thing prints on the next line

        // Arrays act just like Strings!

        String s = "abcdefg";  
        System.out.println(s.length()); // 7 
        // length is a method for Strings and a variable for arrays 
        System.out.println(s.charAt(0)); // a
        System.out.println(s.charAt(6)); // g
        //System.out.println(s.charAt(7));  // StringIndexOutOfBounds Exception
        System.out.println(s.charAt(s.length() - 1)); //g

        // sending an array as a parameter to a method
        printArray(temps);

    }


    // This method takes an array and prints out the contents

    // Note: if you send an array as a parameter to a method, and you change the 
    // array inside the method, the changes will "stick" after the method is done.

    public static void printArray(int[] a) {

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println(); 

    }

}














